package simpleFactory;

public class ProductorFactory {
	public enum TYPE{a,b,c};
		
		public Productor create(TYPE type) {
			Productor pro = null;
			switch(type) {
			case a:
				pro= new ProductorA();
				pro.desc();
			break;
			case b:
				pro= new ProductorB();
				pro.desc();
				break;
			case c:
				pro= new ProductorC();
				pro.desc();
				break;
			default:
			}
			return pro;
		}
	

}
