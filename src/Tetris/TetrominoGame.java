package Tetris;

public class TetrominoGame {
	public static void main(String args[]){
		TetrominoT t = new TetrominoT(3,4);
		printWallAndCell(t);
		TetrominoJ jj = new TetrominoJ();
		printWallAndCell(jj);

		
	}
	public static void printWallAndCell(TetrominoT t){//打印图像
		
		int totalRow = 20;
		int totalCol =10;
		for(int i = 0;i<totalRow;i++){
			for(int j = 0;j<totalCol;j++){
				boolean flag = true;//开关
				for(int k =0;k<t.cells.length ;k++){
					if(i==t.cells[k].row && j==t.cells[k].col){//4个比较后不打-才打*
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
	public static void printWallAndCell(TetrominoJ jj){
		for(int i= 0;i<20;i++){
			for(int j=0;j<10;j++){
				boolean flag = true;
				for(int k = 0;k<jj.cells.length;k++){
					if(i==jj.cells[k].row && j==jj.cells[k].col){
						flag = false;
						System.out.print("* ");
						break;
					}
				}
				if(flag){
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}		
}	

