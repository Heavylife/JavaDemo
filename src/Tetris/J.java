package Tetris;

public class J {
	Cell[] cells;//����Cell������
	public J(){//�޲ι��췽��
		this(0,0);//��ʼ��ֵΪ0��0
	}
	public J(int row,int col){//�вι���
	cells = new Cell[4];//J��4���������
	cells[0] = new Cell(row,col);//Ĭ�ϳ�ʼֵ
	cells[1] = new Cell(row,col+1);
	cells[2] = new Cell(row,col+2);
	cells[3] = new Cell(row+1,col+2);
	}
	//��ӡ���귽��
	public void print(){
		String str ="";
		for(int i =0;i<cells.length;i++){
			str += "("+cells[i].getCellInfo()+ ")";
		}
		System.out.println(str);
	}	
	//drop����
	public void drop(){
		for(int i = 0;i<cells.length;i++){
			cells[i].row++;
		}
	}
	
	//����
	public void moveLeft(){
		for(int i = 0;i<cells.length;i++){
			cells[i].col--;
		}
	}
	
	//����
	public void moveRight(){
		for(int i = 0;i<cells.length;i++){
			cells[i].col++;
		}
	}
}
