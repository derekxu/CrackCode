class SubSquare{
	public int row, col, size;
	public SubSquare(int r, int c, int s){
		row=r;
		col=c;
		size=s;
	}
}
public class SquareColor {
	public int findSquare(int[][] matrix){
		int N = matrix.length;
		int maxSize=0;
		for(int c=0;c<N;c++){
			for(int r=0;r<N;r++){
				for(int s=1;s<=N-Math.max(r,c);s++){
					if(isSquare(matrix,r,c,s)){
						maxSize = s>maxSize?s:maxSize;
					}
				}
			}
		}
		
		return maxSize;
	}
}
