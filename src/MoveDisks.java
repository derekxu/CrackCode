import java.util.*;

class Tower {
	public Stack<Integer> disks;
	public Tower(){
		disks = new Stack<>();
	}
	public void moveTop(Tower t){
		if(t.disks.isEmpty() || disks.peek()<=t.disks.peek())
		{
			t.disks.push(disks.pop());
		}
		else
		{
			throw Exception;
		}
	}
}
public class MoveDisks {
	public static Tower[] towers;
	public static void moveTowers(int n, int from, int to)
	{
		try{
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towers = new Tower[3];
		//init
	}
	

}
