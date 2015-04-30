import java.util.*;
class StackNode{
	public int val;
	public int pre;
	public StackNode(int v, int p){
		val=v;
		pre=p;
	}
}
public class ArrayStacks {
	int len;
	int max;
	StackNode[] stack;
	public int[] tails = new int[]{-1,-1,-1};
	public ArrayStacks(int size){
		len=size*3;
		max=-1;
		stack=new StackNode[len];
	}
	public void push(int istack, int val){
		max++;
		if(max>=len)
		{
			throw RuntimeException;
		}

		stack[max]=new StackNode(val,tails[istack]);
		tails[istack] = max;
	}
	public int pop(int istack)
	{
		if(tails[istack]==-1){ throw RuntimeException;}
		if(tails[istack]==max){max--;}
		
		int value = stack[tails[istack]].val;
		tails[istack] = stack[tails[istack]].pre;
		stack[tails[istack]] = null;
		
		return value;
	}
	
	public boolean isEmpty(int istack){ return tails[istack]==-1; }
}
