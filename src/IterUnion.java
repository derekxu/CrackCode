import java.util.*;
public class IterUnion {
	public Iterable<Integer> union(Iterator<Integer> iter1, Iterator<Integer> iter2){
		if(iter1==null||iter2==null) throw new NullPointerException();
	
		List<Integer> result = new ArrayList<Integer>();
		Integer next1 = iter1.hasNext()?iter1.next():null;
		Integer next2 = iter2.hasNext()?iter2.next():null;
		while(next1!=null && next2!=null){
			if(Integer.compare(next1, next2)<=0){
				if(result.size()==0||!result.get(result.size()-1).equals(next1)){
					result.add(next1);
					next1=iter1.hasNext()?iter1.next():null;
				}
			}else{
				if(result.size()==0||!result.get(result.size()-1).equals(next2)){
					result.add(next2);
					next2=iter2.hasNext()?iter2.next():null;
				}				
			}
		}
		while(next1!=null){
			if(result.size()==0||!result.get(result.size()-1).equals(next1)){
				result.add(next1);
				next1=iter1.hasNext()?iter1.next():null;
			}			
		}
		while(next2!=null){
			if(result.size()==0||!result.get(result.size()-1).equals(next2)){
				result.add(next2);
				next2=iter2.hasNext()?iter2.next():null;
			}			
		}
		
		return result;
	}
	public Iterable<Integer> copy(Iterator<Integer> iter){
		List<Integer> result = new ArrayList<Integer>();
		while(iter.hasNext()){
			result.add(iter.next());
		}
		return result;
	}
}
