package Tetris;

public class TetrominoGame {
	public static void main(String args[]){
		TetrominoT t = new TetrominoT(3,4);
		printWallAndCell(t);
		TetrominoJ j = new TetrominoJ();
		printWallAndCell(j);

		
	}
	public static void printWallAndCell(Tetromino tetromino){//��ӡͼ��
		
		int totalRow = 20;
		int totalCol =10;
		Cell[] cells = tetromino.cells;
		for(int i = 0;i<totalRow;i++){
			for(int j = 0;j<totalCol;j++){
				boolean flag = true;//����
				for(int k =0;k<cells.length ;k++){
					if(i==cells[k].row && j==cells[k].col){//4���ȽϺ󲻴�-�Ŵ�*
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

