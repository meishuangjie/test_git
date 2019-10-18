package strategyModel;

public class PrintStrategy implements Strategy{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStrategy ps = new PrintStrategy();
		Context ct = new Context(ps);
		ct.doAction();

	}

	public void action() {
		// TODO Auto-generated method stub
		System.out.println("print strategy");
	}

}
