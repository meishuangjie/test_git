package factoryModel;

import simpleFactory.Productor;

public class Cusomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Productor proA = new ProductorAFactory();
		proA.desc();
		Productor proB = new ProductorBFactory();
		proB.desc();
		Productor proC = new ProductorBFactory();
		proC.desc();
	}

}
