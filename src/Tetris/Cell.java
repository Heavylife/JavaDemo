package Tetris;


public  class Cell {
	int row;//�к�
	int col;//�к�
	
	public Cell(int row,int col){
		this.row = row;
		this.col = col;
	}
	public Cell(){
		this(0,0);	
		}
	public void drop(){//���䷽��
		row++;
	}
	public void moveLeft(){//����col��
		col--;
	}
	public void moveLeft(int col){//����col��
		this.col-=col;
	}
	public void moveRight(){//����һ��
		col++;
	}
	public void moveRight(int col){//����col�� ������������
		this.col += col;
	}
	public String getCellInfo(){//��ȡ��������
		return row+","+col; 
	} 
}