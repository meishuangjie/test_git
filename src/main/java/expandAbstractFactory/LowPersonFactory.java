package expandAbstractFactory;


public class LowPersonFactory implements IAbstractFactory{

	public Food getFood() {
		// TODO Auto-generated method stub
		return new Egg();
		
	}

	public Car getCar() {
		// TODO Auto-generated method stub
		
		return new Bike();
	}

}
