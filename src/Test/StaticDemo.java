package Test;

public class StaticDemo {
	//��ͨ��Ա����
	public void show(){
		System.out.println("��ͨ����");
	}
	public static void show(String str){
		System.out.println("�������صľ�̬����");
	}
	 static String str;
	//��̬����
	public static void main(String[] args) {
		str = "��̬����";
		StaticDemo.show("��̬������������");
		show("��̬����ֱ�ӵ���"+str);
		StaticDemo s = new StaticDemo();
		s.show();
		s.print();
		
	}
	//��ͨ����
	public void print(){
		System.out.println("��ͨ��������");
		show();
		show("��ͨ����ֱ�ӵ���"+str);
		StaticDemo.show("��̬������������");
	}
}
