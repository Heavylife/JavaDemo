package Tetris;

public class TestO {
	public static void main(String args[]){
		O o= new O();
		System.out.println("ԭʼ����Ϊ��");
		o.print();
		System.out.println("���������Ϊ��");
		o.drop();
		o.print();
		System.out.println("���ƺ�����Ϊ��");
		o.moveLeft();
		o.print();
		System.out.println("���ƺ�����Ϊ��");
		o.moveRight();
		o.print();
	}
}
