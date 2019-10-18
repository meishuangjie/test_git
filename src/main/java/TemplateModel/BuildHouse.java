package TemplateModel;

public abstract class BuildHouse {
		
	private String houseName;
	private boolean isBuildLivingroom;
	
	
	public BuildHouse(String houseName,boolean isBuildLivingroom) {
		super();
		this.houseName = houseName;
		this.isBuildLivingroom=isBuildLivingroom;
	}
	
	protected abstract void buildKitchen();
	protected abstract void buildToilet();
	protected abstract void buildBedroom();
	protected abstract void buildLivingroom();
	
	
	
	public void toBuild() {
		buildKitchen();
		buildToilet();
		buildBedroom();
		if(true == isBuildLivingroom) 
		{
			buildLivingroom();
		}
		
		
	}
}
