package Tetris;

public class TetrominoT extends Tetromino{
	public TetrominoT(){
		this(0,0);
	}
	public TetrominoT(int row,int col){
		super();//���๹�췽������ͨ��super���ø��๹�췽��
		
		cells[0] =new Cell(row,col); 
		cells[1] =new Cell(row,col+1);
		cells[2] =new Cell(row,col+2);
		cells[3] =new Cell(row+1,col+1);
	}
	public void print(){
		System.out.println("I am a T");//������д
		super.print();
	}
}
