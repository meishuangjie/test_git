package abstractFactory;

public class BMWFactory extends AbstractFactory
{
    public Car getCar(String type) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException
    {
        Class cl = Class.forName(type);
        return (BMWCar)cl.newInstance();
    }
}
