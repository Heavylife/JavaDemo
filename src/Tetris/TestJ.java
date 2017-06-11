package Tetris;

public class TestJ {
	public static void main(String args[]){
		J j=new J();
		System.out.println("原始坐标为：");
		j.print();
		System.out.println("下落后的坐标：");
		j.drop();
		j.print();
		System.out.println("左移后的坐标：");
		j.moveLeft();
		j.print();
		System.out.println("右移后的坐标：");
		j.moveRight();
		j.print();
		
	}
}
