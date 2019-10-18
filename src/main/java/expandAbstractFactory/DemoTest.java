package expandAbstractFactory;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAbstractFactory factory = new LowPersonFactory();
        Car car = factory.getCar();
        Food breakFast = factory.getFood();
        System.out.println("吃的早饭是：");
        breakFast.eat();
        System.out.println("上班交通工具是：");
        car.drive();

        IAbstractFactory factory2 = new HighPersonFactory();
        car = factory2.getCar();
        breakFast = factory2.getFood();
        System.out.println("吃的早饭是：");
        breakFast.eat();
        System.out.println("上班交通工具是：");
        car.drive();

	}

}
