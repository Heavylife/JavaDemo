package Test;

public class StaticDemo2 {
	int num1;
	int num2;
	static int num3;
	public  StaticDemo2(){
		num1 =33;//���췽����ֵ
		System.out.println("���췽����ֵ");
	}
	{
		num2= 88;//��ʼ���鸳ֵ
		System.out.println("��ʼ���鸳ֵ:");
	}
	static {
		num3 = 99;//��̬��ʼ���鸳ֵ
		System.out.println("��̬��ʼ���鸳ֵ");
	}
	public static void main(String args[]){
		StaticDemo2 sd = new StaticDemo2();
		System.out.println("num1:"+sd.num1);
		System.out.println("num2:"+sd.num2);
		System.out.println("num3:"+num3);
		StaticDemo2 sd2 = new StaticDemo2();
	}
}
