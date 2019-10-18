package abstractFactory;

public class BenzFactory extends AbstractFactory
{
    public Car getCar(String type) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException
    {
        Class cl = Class.forName(type);
        return (BenzCar)cl.newInstance();
    }
}
