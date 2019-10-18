package buildModel;

public class BuildImpl extends Build{
	
	private Productor pro = new Productor();
	
	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		pro.setId(id);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		pro.setName(name);
	}

	@Override
	public void setWeight(float weight) {
		// TODO Auto-generated method stub
		pro.setWeight(weight);
	}

	@Override
	public void setHeight(float height) {
		// TODO Auto-generated method stub
		pro.setHeight(height);
	}

	@Override
	public Productor creat() {
		// TODO Auto-generated method stub
		
		return pro;
	}

}
