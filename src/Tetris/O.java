package Tetris;

public class O {
	Cell[] cells;
	public  O(){//构造无参函数并初始化0，0
		this(0,0);
	}
	//构造有参函数
	public  O(int row,int col){
		cells = new Cell[4];
		cells[0]=new Cell(row,col);
		cells[1]=new Cell(row,col+1);
		cells[2]=new Cell(row+1,col+1);
		cells[3]=new Cell(row+1,col+2);
	}
	//打印坐标
	public void print(){
		String str="";
		for(int i =0;i<cells.length;i++){
			str +="("+cells[i].getCellInfo()+")";
		}
		System.out.println(str);
	}
	//下落方法
	public void drop(){
		for(int i = 0;i<cells.length;i++){
			cells[i].row++;
		}
	}
	//左移方法
	public void moveLeft(){
		for(int i = 0;i<cells.length;i++){
			cells[i].col--;
		}
	}
	//右移方法
	public void moveRight(){
		for(int i = 0;i<cells.length;i++){
			cells[i].col++;
		}
	}	
	
}
