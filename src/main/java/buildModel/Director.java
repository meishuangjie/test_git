package buildModel;

public class Director {
	private Build mBuild ;

	public Director(Build mBuild) {
		super();
		this.mBuild = mBuild;
	}

	public void cons(String id,String name ,float weight,float height) {
		mBuild.setId(id);
		mBuild.setName(name);
		mBuild.setWeight(weight);
		mBuild.setHeight(height);
	}

}
