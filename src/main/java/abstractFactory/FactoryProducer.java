package abstractFactory;

public class FactoryProducer
{
    @SuppressWarnings("deprecation")
	public static AbstractFactory getFactory(String type)
            throws IllegalAccessException, InstantiationException, ClassNotFoundException
    {
    	 System.out.println("创建工厂"+type);
        Class<?> cl = Class.forName(type);
       
        return (AbstractFactory)cl.newInstance();
    }
}
