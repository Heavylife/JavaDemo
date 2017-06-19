package rentalcar;

public class LightTruck extends Auto implements ICarryWeight {
	int weight = 4;
	float price = 400;
	public  void run(){};
	public void CarryWeight(){
		System.out.println("轻卡可以载重"+weight+"T,"+"价格是"+price+"元/");
	}
}
