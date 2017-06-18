package Test;

public class StaticDemo2 {
	int num1;
	int num2;
	static int num3;
	public  StaticDemo2(){
		num1 =33;//构造方法赋值
		System.out.println("构造方法赋值");
	}
	{
		num2= 88;//初始化块赋值
		System.out.println("初始化块赋值:");
	}
	static {
		num3 = 99;//静态初始化块赋值
		System.out.println("静态初始化块赋值");
	}
	public static void main(String args[]){
		StaticDemo2 sd = new StaticDemo2();
		System.out.println("num1:"+sd.num1);
		System.out.println("num2:"+sd.num2);
		System.out.println("num3:"+num3);
		StaticDemo2 sd2 = new StaticDemo2();
	}
}
