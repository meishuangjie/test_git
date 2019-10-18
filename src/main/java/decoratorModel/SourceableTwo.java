package decoratorModel;

public class SourceableTwo implements Sourcable {
	
	Sourcable sourcable;
	
	public SourceableTwo(Sourcable sourcable) {
		super();
		this.sourcable = sourcable;
	}

	public void opertation() {
		// TODO Auto-generated method stub
		System.out.println("before SourceableTwo!");
		sourcable.opertation();
		System.out.println("after SourceableTwo!");

	}

}
