package Tetris;

public class TetrominoGame {
	public static void main(String args[]){
		TetrominoT t = new TetrominoT(3,4);
		printWallAndCell(t);
		TetrominoJ j = new TetrominoJ();
		printWallAndCell(j);

		
	}
	public static void printWallAndCell(Tetromino tetromino){//打印图像
		
		int totalRow = 20;
		int totalCol =10;
		Cell[] cells = tetromino.cells;
		for(int i = 0;i<totalRow;i++){
			for(int j = 0;j<totalCol;j++){
				boolean flag = true;//开关
				for(int k =0;k<cells.length ;k++){
					if(i==cells[k].row && j==cells[k].col){//4个比较后不打-才打*
						flag = false;//坐标配上时，不打-
						System.out.print("* ");
						break;
					}
				}
				if(flag){//flag为真时，打印-
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
	}
	
	
}	

