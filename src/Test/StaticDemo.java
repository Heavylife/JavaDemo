package Test;

public class StaticDemo {
	//��ͨ��Ա����
	public void show(){
		System.out.println("��ͨ����");
	}
	public static void show(String str){
		System.out.println("�������صľ�̬����");
	}
	//��̬����
	public static void main(String[] args) {
		StaticDemo.show("��̬������������");
		show("��̬����ֱ�ӵ���");
		StaticDemo s = new StaticDemo();
		s.show();
		s.print();
		
	}
	//��ͨ����
	public void print(){
		System.out.println("��ͨ��������");
		show();
		show("��̬����ֱ�ӵ���");
		StaticDemo.show("��̬������������");
	}
}
