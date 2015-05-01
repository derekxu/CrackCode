package algorithm;
import java.lang.*;
public class CH5_1 {
	public static int updateBits(int n, int m, int i, int j){
		int max=~0;
		int left = max-((1<<j)-1);
		int right = max-((1<<i)-1);
		int mask=left|right;
		return (n&mask)|(m<<i);
	}
	
	public static void main(String[] args)
	{
		int res = updateBits(0xc00,0x19,2,6);
		System.out.println(Integer.toHexString(res));
	}
}
