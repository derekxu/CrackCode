import java.lang.*;

public class PickRandom {
	public int getIndex(int l, int r)
	{
		return (int) (l+ Math.random() *(r-l+1));
	}
	public int[] pickRandom(int[] ar)
	{
		if(ar.length==0) return ar;
		for(int i=0;i<ar.length;i++)
		{
			int idx = getIndex(i,ar.length-1);
			int temp = ar[i];
			ar[i]=ar[idx];
			ar[idx]=temp;
		}
		
		return ar;
	}
}
