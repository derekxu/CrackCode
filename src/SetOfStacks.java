import java.util.*;
class SetStack extends Stack<Integer>{
	public int count;
	int cap;
	public SetStack(int cap){
		super();
		this.cap=cap;
		count=0;
	}
	public boolean isAtCap(){
		return count>=cap;
	}
}
public class SetOfStacks {
	List<SetStack> stacks;
	int cap;
	public SetOfStacks(int c){
		stacks = new ArrayList<>();
		cap=c;
	}
	public void push(int val)
	{
		SetStack last = stacks.get(stacks.size()-1);
		if(last!=null && !last.isAtCap()){
			last.push(val);
		}else{
			last = new SetStack(cap);
			last.push(val);
			stacks.add(last);
		}
	}
	
	public int pop(){
		SetStack last = stacks.get(stacks.size()-1);
		if(last==null||last.isEmpty()){ throw Exception; }
		
		int val = last.pop();
		if(last.isEmpty()){stacks.remove(stacks.size()-1);}
		return val;
	}
	
}
