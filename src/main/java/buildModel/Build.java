package buildModel;

public abstract class Build {

	public abstract void setId(String id);
	public abstract void setName(String name);
	public abstract void setWeight(float weight);
	public abstract void setHeight(float height);
	
	
	public abstract Productor creat();
	
}
