
public class ShuffleCards {
	public void shuffle(int[] cards)
	{
		for(int i=0;i<cards.length;i++)
		{
			int idx = (int) Math.random()*(cards.length-i)+i;
			int temp = cards[i];
			cards[i]=cards[idx];
			cards[idx]=temp;
		}
	}
}
