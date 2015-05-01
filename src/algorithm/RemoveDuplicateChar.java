package algorithm;

public class RemoveDuplicateChar {
	public int removeDuplicates(char[] str){
		int[] map = new int[8];
		int tail=1;
		for(int i=1;i<str.length;i++)
		{
			int j = ((int)str[i])/32;
			int k = ((int)str[i])%32;
			if(((map[j]>>k)&1)==0){
				map[j] = map[j]|(1<<k);
				str[tail++]=str[i];
			}
		}
		return tail;
	}
}
