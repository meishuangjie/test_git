package abstractFactory;

public class DemoTest {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		// TODO Auto-generated method stub
		 AbstractFactory abstractFactory = FactoryProducer.getFactory("abstractFactory.BMWFactory");
	        Car bmwCar = abstractFactory.getCar("abstractFactory.BMW320");
	        bmwCar.drive();

	        Car bmwCar1 = abstractFactory.getCar("abstractFactory.BMW530");
	        bmwCar1.drive();

	        Car bmwCar2 = abstractFactory.getCar("abstractFactory.BMW740");
	        bmwCar2.drive();

	        AbstractFactory abstractFactory1 = FactoryProducer.getFactory("abstractFactory.BenzFactory");
	        Car benzCar = abstractFactory1.getCar("abstractFactory.BenzC200");
	        benzCar.drive();

	        Car benzCar1 = abstractFactory1.getCar("abstractFactory.BenzE300");
	        benzCar1.drive();

	}

}
