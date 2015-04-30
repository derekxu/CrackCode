
public class MatrixSum {
	public int largestSum(int[][] matrix){
		
		int[][] sumMat = preComputeMatrix(matrix);
		int m=matrix.length, n=matrix[0].length;
		int res=0;
		for(int r=0;r<m;r++){
			for(int r2=r;r2<m;r2++){
				for(int c=0;c<n;c++){
					for(int c2=c;c2<n;c2++){
						int sum = compute(sumMat, r, r2, c, c2);
						if(sum>res) res=sum;
					}
				}				
			}
		}
		
		return res;
	}
	
	public int[][] preComputeMatrix(int[][] mat){
		int m=mat.length, n=mat[0].length;
		int[][] res = new int[m][n];
		res[0][0]=mat[0][0];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				res[i][j] = mat[i][j];
				if(i>0){
					res[i][j]+=res[i-1][j];
				}
				if(j>0){
					res[i][j]+=res[i][j-1];
				}
			}
		}
		
		return res;
	}
	
	public int compute(int[][] sumMat, int r, int r2, int c, int c2){
		return sumMat[r2][c2] - sumMat[r][c2] - sumMat[r2][c] + sumMat[r][c];
	}
}
