package Tetris;

public class O {
	Cell[] cells;
	public  O(){//�����޲κ�������ʼ��0��0
		this(0,0);
	}
	//�����вκ���
	public  O(int row,int col){
		cells = new Cell[4];
		cells[0]=new Cell(row,col);
		cells[1]=new Cell(row,col+1);
		cells[2]=new Cell(row+1,col+1);
		cells[3]=new Cell(row+1,col+2);
	}
	//��ӡ����
	public void print(){
		String str="";
		for(int i =0;i<cells.length;i++){
			str +="("+cells[i].getCellInfo()+")";
		}
		System.out.println(str);
	}
	//���䷽��
	public void drop(){
		for(int i = 0;i<cells.length;i++){
			cells[i].row++;
		}
	}
	//���Ʒ���
	public void moveLeft(){
		for(int i = 0;i<cells.length;i++){
			cells[i].col--;
		}
	}
	//���Ʒ���
	public void moveRight(){
		for(int i = 0;i<cells.length;i++){
			cells[i].col++;
		}
	}	
	
}
