package Tetris;

public class TestT {
	public static void main(String args[]){
		T t=new T(0,1);
		//����print����
		System.out.println("ԭʼ���꣺");
		t.print();
		//����drop����
		t.drop();
		System.out.println("����drop����������꣺");
		t.print();
		
		//����moveLeft����
		t.moveLeft();
		System.out.println("����moveLeft����������꣺");
		t.print();
		//����moveRight����
		t.moveRight();
		System.out.println("����moveRight����������꣺");
		t.print();

	}
}
