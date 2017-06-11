package Tetris;
import java.util.Scanner;
public class CellGame {
	public static void main(String args[]){
		Cell cell = new Cell();
		cell.row = 3;
		cell.col = 3;
		int inPut;
		printCell(cell);
		do{//循环
			
			System.out.println("请输入操作项目：");
			Scanner sc = new Scanner(System.in);
			inPut =  sc.nextInt();
			if(inPut == 0){
				break;
			}
			fun(inPut,cell);
			printCell(cell);
			
		}while(inPut != 0);
		System.out.println("游戏结束！");

	}
	public static void printCell(Cell cell){//打印墙及坐标
		int totalRow = 20;
		int totalCol = 10;//总的行和列
		System.out.println("cell的位置为："+cell.getCellInfo());

		for(int i = 0 ; i < totalRow;i++){
			for(int j = 0;j<totalCol;j++){
				if(i == cell.row && j == cell.col){
					System.out.print("* ");
				}else{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		System.out.println("1 -- 下落，2 -- 向左，3 -- 向右，0 -- 退出");
	}
	public static void fun(int num,Cell cell){//移动操作
		switch(num){
		case 1:
			cell.drop();
			break;
		case 2:
			cell.moveLeft();
			break;
		case 3:
			cell.moveRight();
			break;
		
		}
	}
}