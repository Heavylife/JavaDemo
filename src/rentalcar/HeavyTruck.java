package rentalcar;

public class HeavyTruck extends Auto implements ICarryWeight {
	int weight = 20;
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
	public void CarryWeight(){
		System.out.println("�Ῠ��������"+weight+"T");
	};

}
