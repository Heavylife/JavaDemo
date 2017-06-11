package Tetris;

public class TestT {
	public static void main(String args[]){
		T t=new T(0,1);
		//测试print方法
		System.out.println("原始坐标：");
		t.print();
		//测试drop方法
		t.drop();
		System.out.println("调用drop方法后的坐标：");
		t.print();
		
		//测试moveLeft方法
		t.moveLeft();
		System.out.println("调用moveLeft方法后的坐标：");
		t.print();
		//测试moveRight方法
		t.moveRight();
		System.out.println("调用moveRight方法后的坐标：");
		t.print();

	}
}
