package rentalcar;

public class LightTruck extends Auto implements ICarryWeight {
	int weight = 4;
	float price = 400;
	public  void run(){};
	public void CarryWeight(){
		System.out.println("�Ῠ��������"+weight+"T,"+"�۸���"+price+"Ԫ/");
	}
}
