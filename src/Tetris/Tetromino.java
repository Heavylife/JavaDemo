package Tetris;

public class Tetromino {
	Cell[] cells;
	
	public Tetromino(){
		cells = new Cell[4];	
	}
	public void print(){//��ӡ������4���������ڵ�����
		String str = "";
			for(int i =0;i<cells.length-1;i++){
				str +="("+cells[i].getCellInfo()+ ")";
			}
			str +="("+cells[cells.length-1].getCellInfo()+ ")";
			System.out.println(str);
		}
	public void drop(){
		for(int i = 0;i<cells.length-1;i++){
			cells[i].row++;
		}
	}
	public void moveLeft(){
		for(int i = 0;i<cells.length-1;i++){
			cells[i].col--;
		}
	}
	public void moveRight(){
		for(int i = 0;i<cells.length-1;i++){
			cells[i].col++;
		}
	}
	
}
