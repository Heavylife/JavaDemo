package Tetris;

public class TestJ {
	public static void main(String args[]){
		J j=new J();
		System.out.println("ԭʼ����Ϊ��");
		j.print();
		System.out.println("���������꣺");
		j.drop();
		j.print();
		System.out.println("���ƺ�����꣺");
		j.moveLeft();
		j.print();
		System.out.println("���ƺ�����꣺");
		j.moveRight();
		j.print();
		
	}
}
