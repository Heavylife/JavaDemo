package Test;
//����������ʾ
public class UpTest {
	public static void main(String[] args) {
		Moo m = new Moo();
		m.m = 4;
		m.say();
		Noo o = new Noo();
		o.n=5;
		o.say();
		Moo d = new Noo();
		d.say();
		//d.n = 4;ֻ�ܷ��ʸ���ĳ�Ա
	}
}
class Moo{
	int m;
	void say(){}
}
class Noo extends Moo{
	int n;
	void show(){}
}