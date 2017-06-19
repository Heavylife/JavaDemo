package rentalcar;

public class PickupTruck extends Auto implements ICarryPerson,ICarryWeight{
	int num;
	int weight;
	public void run(){
		System.out.println("Εά");
	};
	public void CarryPerson(){}
	public void CarryWeight(){}
}
