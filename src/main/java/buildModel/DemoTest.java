package buildModel;

public class DemoTest {
	public static  void main(String args[]) {
		Build builder = new BuildImpl();
	    Director dire= new Director(builder);
	    dire.cons("1", "2", 3, 4);
	    Productor pro = builder.creat();
	    System.out.println(pro.toString());
	    
	    
//	    Productor computer = new Productor.Builder().setId("1")
//	    											.setName("2").setHeight(1).setHeight(1).build();
	}
	
}
