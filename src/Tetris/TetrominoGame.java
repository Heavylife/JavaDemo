package Tetris;

public class TetrominoGame {
	public static void main(String args[]){
		TetrominoT t = new TetrominoT(3,4);
		printWallAndCell(t);
		
	}
	public static void printWallAndCell(TetrominoT t){//��ӡͼ��
		
		int totalRow = 20;
		int totalCol =10;
		for(int i = 0;i<totalRow;i++){
			for(int j = 0;j<totalCol;j++){
				boolean flag = true;//����
				for(int k =0;k<t.cells.length ;k++){
					if(i==t.cells[k].row && j==t.cells[k].col){//4���ȽϺ󲻴�-�Ŵ�*
						flag = false;//��������ʱ������-
						System.out.print("* ");
						break;
					}
				}
				if(flag){//flagΪ��ʱ����ӡ-
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
	}
			
}	

