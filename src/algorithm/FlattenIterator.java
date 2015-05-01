package algorithm;
import java.util.*;
public class FlattenIterator<T> implements Iterator<T> {
	public Stack<Iterator> iterStack;
	public T next;
	public boolean nextValid =false;
	
	public FlattenIterator(List lst){
		if(lst==null) throw new NullPointerException();
		next=null;
		iterStack=new Stack<Iterator>();
		iterStack.push(lst.iterator());
	}
	public void remove(){
		iterStack.removeAllElements();
	}
	public boolean moveToNext(){
		while(!iterStack.empty()){
			if(!iterStack.peek().hasNext()){
				iterStack.pop();
				continue;
			}
			
			final Object peek = iterStack.peek().next();
			
			if(peek instanceof T){
				next = (T) peek;
				return true;
			}else if(peek instanceof Iterable){
				iterStack.push((Iterator) peek);
				continue;
			}else{
				throw new Exception();
			}
		}
		return false;
	}
	public boolean hasNext(){
		if(!nextValid) nextValid = moveToNext();
		return nextValid;
	}
	public T next(){
		if(!hasNext()) throw new NoSuchElementException();
		nextValid=false;
		return next;
	}
}
