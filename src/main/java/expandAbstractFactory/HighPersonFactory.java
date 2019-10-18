package expandAbstractFactory;

public class HighPersonFactory implements IAbstractFactory {

	public Food getFood() {
		// TODO Auto-generated method stub
		return new Apple();
	}

	public Car getCar() {
		// TODO Auto-generated method stub
		return new Train();
	}

}
