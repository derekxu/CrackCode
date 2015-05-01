package algorithm;
import java.util.*;
public class Othello {
	private final int gameContinue=0;
	private final int black = 1;
	private final int white = 2;
	private final int even = 3;
	int[][] board;
	public void start(){}
	
	private int won(){
		if(!canGo(white) && !canGo(black)){
			int count=0;
			for(int i=0;i<board.length;i++){
				for(int j=0;j<board[0].length;j++){
					if(board[i][j]==white){
						count++;
					}
					else if(board[i][j]==black){
						count--;
					}
				}
			}
			if(count<0) return black;
			if(count>0) return white;
			return even;
		}
		return gameContinue;
	}
	
	private boolean canGo(int color){
		
		return false;
	}
	private boolean isValid(int color, int r, int c){}
	
	private void getMove(int color) throws Exception{Scanner sc = new Scanner(System.in); }
	public void game(){
		while(won() == gameContinue){
			boolean valid = false;
			printBoard();
			while (!valid){
				try{
					getMove(black);
				}
				catch(Exception e){
					System.out.println("Valid coordinate!");
				}
			}
			printBoard();
		}
		
		if(won()!=even){
			System.out.println(won()==black? "black":"white");
		}else{
			System.out.println("Draw");
		}
	}
}
