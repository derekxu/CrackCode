class BitSet{
	int[] bitset;
	public BitSet(int size){
		bitset = new int[size>>5];
	}
	public boolean get(int pos)
	{
		int arrPos = (pos>>5);
		int bitPos = (pos & 0x1F);
		return ((bitset[arrPos]>>bitPos) & 1)==1;
	}
	public void set(int pos)
	{
		int arrPos = (pos>>5);
		int bitPos = (pos & 0x1F);
		bitset[arrPos] = (bitset[arrPos] | (1<<bitPos));
	}
}
public class CheckDuplicates {
	public static void checkDuplicates( int[] arr)
	{
		BitSet set = new BitSet(32000);
		for(int i=0;i<arr.length;i++)
		{
			if(set.get(arr[i])){
				System.out.println(arr[i]);
			}else{
				set.set(arr[i]);
			}
		}
	}
	public static void main(String[] args)
	{
		checkDuplicates(new int[]{0,1,2,3,4,5,7,1,3});
	}
}
