package strategyModel;

public class WriteStrategy implements Strategy{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WriteStrategy ps = new WriteStrategy();
		Context ct = new Context(ps);
		ct.doAction();

	}

	public void action() {
		// TODO Auto-generated method stub
		System.out.println("wirte strategy");
	}

}
