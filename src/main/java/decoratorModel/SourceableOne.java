package decoratorModel;

public class SourceableOne implements Sourcable {
	
	Sourcable sourcable;
	
	public SourceableOne(Sourcable sourcable) {
		super();
		this.sourcable = sourcable;
	}

	public void opertation() {
		// TODO Auto-generated method stub
		System.out.println("before sourceableOne!");
		sourcable.opertation();
		System.out.println("after sourceableOne!");

	}

}
