package simpleFactory;

import simpleFactory.ProductorFactory.TYPE;

public class Cosumer {
	public static void main(String args[]) {
		ProductorFactory proFac = new ProductorFactory();
		proFac.create(TYPE.a);
		proFac.create(TYPE.b);
		proFac.create(TYPE.c);
	}
}
