package rentalcar;

public class Cars extends Auto implements ICarryPerson{
	int num = 4;
	public void run(){}
	public void CarryPerson(){
		System.out.println("小轿车可以载人"+num);
	}

}
