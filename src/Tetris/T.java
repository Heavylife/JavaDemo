package Tetris;

public class T {
	
	Cell[] cells;//引用类型数组

	public T(){//无参构造方法
			this(0,0);//调用的有参构造方法，并且初始化方块的值为0，0
		}
	public T(int row,int col){
		cells = new Cell[4];//T型由4个方块组成
		//顺时针初始化Cell
		cells[0]=new Cell(row,col);//假设T型方块出来的初始值
		cells[1]=new Cell(row,col+1);
		cells[2]=new Cell(row,col+2);
		cells[3]=new Cell(row+1,col+1);
	
	}
	public void print(){//打印方块中4个格子所在的坐标
		String str = "";
			for(int i =0;i<cells.length-1;i++){
				str +="("+cells[i].getCellInfo()+")";
			}
		}
}
