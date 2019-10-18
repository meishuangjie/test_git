package ChainModel;


/**

 * 测试

 */

public class Client {

    public static void main(String[] args) {

        Handler h1 = new ConcreteHandler();

        Handler h2 = new ConcreteHandler();
        
        Handler h3 = new ConcreteHandler();
        
        Handler h4 = new ConcreteHandler();
        
        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());
        System.out.println(h4.toString());
        
        
        h1.setNextHandler(h2);   //h1的下一个处理器是h2
        h2.setNextHandler(h3);   //h1的下一个处理器是h2
        h3.setNextHandler(h4);   //h1的下一个处理器是h2

        h1.handleRequest();

    }

}
