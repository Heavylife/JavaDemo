package Tetris;
import java.util.Scanner;
public class CellGame {
	public static void main(String args[]){
		Cell cell = new Cell();
		cell.row = 3;
		cell.col = 3;
		int inPut;
		printCell(cell);
		do{//ѭ��
			
			System.out.println("�����������Ŀ��");
			Scanner sc = new Scanner(System.in);
			inPut =  sc.nextInt();
			if(inPut == 0){
				break;
			}
			fun(inPut,cell);
			printCell(cell);
			
		}while(inPut != 0);
		System.out.println("��Ϸ������");

	}
	public static void printCell(Cell cell){//��ӡǽ������
		int totalRow = 20;
		int totalCol = 10;//�ܵ��к���
		System.out.println("cell��λ��Ϊ��"+cell.getCellInfo());

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
		System.out.println("1 -- ���䣬2 -- ����3 -- ���ң�0 -- �˳�");
	}
	public static void fun(int num,Cell cell){//�ƶ�����
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