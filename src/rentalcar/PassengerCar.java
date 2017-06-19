package rentalcar;

public class PassengerCar extends Auto implements ICarryPerson {
	int num = 20;
	@Override
	public void CarryPerson(){
		// TODO Auto-generated method stub
		System.out.println("客车可以载人"+num);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
