package Test;

public class OverloadOverrideDemo {

	public static void main(String[] args) {
		Aooo o =new Booo();
		o.show();
		Coo c = new Coo();
		c.t(o);
	}

}
class Aooo{
	void show(){
		System.out.println("�����SHOW");
	}
}
class Booo extends Aooo{
	void show(){
		System.out.println("�����show");
	}
}
class Coo{
	void t(Aooo o){
		System.out.println("�������");
	}
	void t(Booo o){
		System.out.println("�������");
	}
}