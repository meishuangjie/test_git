package callback;

public class CallBackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee em = new Employee();
		Employee call = em.regist(new Boss(),em);
		call.doSomething();
		
	}

}
