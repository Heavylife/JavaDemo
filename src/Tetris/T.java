package Tetris;

public class T {
	
	Cell[] cells;//������������

	public T(){//�޲ι��췽��
			this(0,0);//���õ��вι��췽�������ҳ�ʼ�������ֵΪ0��0
		}
	public T(int row,int col){
		cells = new Cell[4];//T����4���������
		//˳ʱ���ʼ��Cell
		cells[0]=new Cell(row,col);//����T�ͷ�������ĳ�ʼֵ
		cells[1]=new Cell(row,col+1);
		cells[2]=new Cell(row,col+2);
		cells[3]=new Cell(row+1,col+1);
	
	}
	public void print(){//��ӡ������4���������ڵ�����
		String str = "";
			for(int i =0;i<cells.length-1;i++){
				str +="("+cells[i].getCellInfo()+")";
			}
		}
}
