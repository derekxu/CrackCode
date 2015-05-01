package designQuestions;
import java.util.*;
enum Color{
	Black,White;
}
class Move{
	Block from;
	Block to;
	public Move(Block from, Block to){
		
	}
}
class Block{
	int x;
	int y;
	Piece piece;
	public Block(int x, int y, Piece piece){
		this.x=x;
		this.y=y;
		this.piece=piece;
	}
	public void setBlock(Piece piece){
		this.piece=piece;
	}
	public Piece getBlock(){
		return this.piece;
	}
}
abstract class Piece{
	int id;
	Color color;
	public Piece(int id, Color color){
		this.id = id;
		this.color = color;
	}
	public boolean isValidMove(Move move){
		//...
		return true;
	}
}
class King extends Piece{
	public King(int id, Color color){
		super(id,color);
	}

	public boolean isValidMove(Move move){
		//...
		return true;
	}
}
class Player{
	List<Piece> pieces; 
	Map<Integer,Block> pieceMap;
	public Player(){
		
	}
	public Move playTurn(Piece piece, Block toBlock){
		return new Move(pieceMap.get(piece),toBlock);
	}
}
public class ChessGame {
	public static Block[][] board;
	public Player[] players;
	public ChessGame(){
		board = new Block[8][8];
		players=new Player[2];
		initializeBoard();
	}
	public void initializeBoard(){
		
	}
	public void play(Player player){
		
	}
	public void checkKill(){
		
	}
	public void checkGameOver(){
		
	}
	public boolean validateMove(Move move){
		if(move.from.piece!=null){
			return move.from.piece.isValidMove(move);
		}else{
			return false;
		}
	}
	public void updateBoard(){
		
	}
}
