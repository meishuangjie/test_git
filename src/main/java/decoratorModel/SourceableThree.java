package decoratorModel;

public class SourceableThree implements Sourcable {
	
	Sourcable sourcable;
	
	public SourceableThree(Sourcable sourcable) {
		super();
		this.sourcable = sourcable;
	}

	public void opertation() {
		// TODO Auto-generated method stub
		System.out.println("before SourceableThree!");
		sourcable.opertation();
		System.out.println("after SourceableThree!");

	}

}
