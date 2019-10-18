package callback;

public class Employee {
	Inter inter;
	public Employee regist(Inter inter,Employee call) {
		this.inter=inter;
		return call;
	}
	
	public void  doSomething() {
		System.out.println("employee do something here!");
		inter.show();
	}
}
