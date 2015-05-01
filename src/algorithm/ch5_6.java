package algorithm;

public class ch5_6 {
	public static int getSwap(int x)
	{
		return ((x & 0xaaaaaaaa)>>1 | (x&0x55555555)<<1);
	}
}
