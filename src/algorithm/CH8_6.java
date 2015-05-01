package algorithm;
import java.util.*;
public class CH8_6 {
	enum Color{
		Black, White, Red, Yellow, Green
	}
	public boolean paintFill(Color[][] screen, int r, int c, Color ncolor)
	{
		if(r<0||r>=screen.length||c<0||c>=screen[0].length)
			return false;
		int m=screen.length, n=screen[0].length;
		Color ocolor = screen[r][c];
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.add(r*n+c);
		while(!q.isEmpty())
		{
			int idx = q.poll();
			r=idx/n; c=idx%n;
			screen[r][c]=ncolor;
			for(int i=r-1;i<=r+1;i+=2)
			{
				if(i>=0 && i<m && screen[i][c]==ocolor)
				{
					q.add(i*n+c);
				}
			}
			
			for(int i=c-1;i<=c+1;i+=2)
			{
				if(i>=0 && i<n && screen[r][i]==ocolor)
				{
					q.add(r*n+i);
				}
			}			
		}
		
		return true;
	}

}
