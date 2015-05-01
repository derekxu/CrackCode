package algorithm;

public class CH5_3 {
	public static boolean GetBit(int n, int index)
	{
		return ((n & (1<<index))>0);
	}
	public static int SetBit(int n, int index, boolean b)
	{
		if(b)
		{
			return n|(1<<index);
		}
		else
		{
			int mask = ~(1<<index);
			return n & mask;
		}
	}
	
	public static int GetNext_NP(int n)
	{
		if(n<0) return 0;
		if(n==0) return 1;
		
		int i=0;
		while(!GetBit(n,i))
		{
			i++;
		}
		int count=0;
		while(GetBit(n,i))
		{
			i++;
			count++;
			if(i>31)
			{
				return (((n & 1) == 0)?n+1:-1);
			}
		}
		
		n=SetBit(n,i,true);
		i--;
		count--;
		n=SetBit(n,i,false);
		int c=0;
		for(int j=i-1;c<count;j--)
		{
			n=SetBit(n,j,false);
			c++;
		}
		int idx=0;
		while(count>0)
		{
			n=SetBit(n,idx,true);
			idx++;
			count--;
		}
		
		return n;
	}

}
