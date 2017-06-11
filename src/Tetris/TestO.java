package Tetris;

public class TestO {
	public static void main(String args[]){
		O o= new O();
		System.out.println("原始坐标为：");
		o.print();
		System.out.println("下落后坐标为：");
		o.drop();
		o.print();
		System.out.println("左移后坐标为：");
		o.moveLeft();
		o.print();
		System.out.println("右移后坐标为：");
		o.moveRight();
		o.print();
	}
}
