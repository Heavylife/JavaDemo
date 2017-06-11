package Tetris;

public class TetrominoT extends Tetromino{
	public TetrominoT(int row,int col){
		super();//子类构造方法必须通过super调用父类构造方法
		cells[0] =new Cell(row,col); 
		cells[1] =new Cell(row,col+1);
		cells[2] =new Cell(row,col+2);
		cells[3] =new Cell(row+1,col+1);
	}
}
