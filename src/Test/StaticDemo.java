package Test;

public class StaticDemo {
	//普通成员方法
	public void show(){
		System.out.println("普通方法");
	}
	public static void show(String str){
		System.out.println("我是重载的静态方法");
	}
	 static String str;
	//静态方法
	public static void main(String[] args) {
		str = "静态变量";
		StaticDemo.show("静态方法类名调用");
		show("静态方法直接调用"+str);
		StaticDemo s = new StaticDemo();
		s.show();
		s.print();
		
	}
	//普通方法
	public void print(){
		System.out.println("普通方法调用");
		show();
		show("普通方法直接调用"+str);
		StaticDemo.show("静态方法类名调用");
	}
}
