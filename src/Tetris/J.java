package Tetris;

public class J {
	Cell[] cells;//创建Cell类数组
	public J(){//无参构造方法
		this(0,0);//初始化值为0，0
	}
	public J(int row,int col){//有参构造
	cells = new Cell[4];//J由4个方块组成
	cells[0] = new Cell(row,col);//默认初始值
	cells[1] = new Cell(row,col+1);
	cells[2] = new Cell(row,col+2);
	cells[3] = new Cell(row+1,col+2);
	}
	//打印坐标方法
	public void print(){
		String str ="";
		for(int i =0;i<cells.length;i++){
			str += "("+cells[i].getCellInfo()+ ")";
		}
		System.out.println(str);
	}	
	//drop方法
	public void drop(){
		for(int i = 0;i<cells.length;i++){
			cells[i].row++;
		}
	}
	
	//左移
	public void moveLeft(){
		for(int i = 0;i<cells.length;i++){
			cells[i].col--;
		}
	}
	
	//右移
	public void moveRight(){
		for(int i = 0;i<cells.length;i++){
			cells[i].col++;
		}
	}
}
