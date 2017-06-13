package Tetris;


public  class Cell {
	int row;//行号
	int col;//列号
	
	public Cell(int row,int col){
		this.row = row;
		this.col = col;
	}
	public Cell(){
		this(0,0);	
		}
	public void drop(){//下落方法
		row++;
	}
	public void moveLeft(){//左移col列
		col--;
	}
	public void moveLeft(int col){//左移col列
		this.col-=col;
	}
	public void moveRight(){//下落一行
		col++;
	}
	public void moveRight(int col){//下落col行 ，方法的重载
		this.col += col;
	}
	public String getCellInfo(){//获取格子坐标
		return row+","+col; 
	} 
}