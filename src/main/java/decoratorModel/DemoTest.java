package decoratorModel;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source source = new Source();
		
		SourceableTwo sourceableTwo = new SourceableTwo( new SourceableThree(new SourceableOne(source)));
		
		sourceableTwo.opertation();
	}

}
