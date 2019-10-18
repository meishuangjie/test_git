package TemplateModel;

public class HouseTwo extends BuildHouse {

	private static HouseTwo houseTwo;

	public HouseTwo(String houseName, boolean isBuildLivingroom) {
		super(houseName, isBuildLivingroom);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void buildKitchen() {
		// TODO Auto-generated method stub
		System.out.println("HouseTwo buildKitchen");
	}

	@Override
	protected void buildToilet() {
		// TODO Auto-generated method stub
		System.out.println("HouseTwo buildToilet");
	}

	@Override
	protected void buildBedroom() {
		// TODO Auto-generated method stub
		System.out.println("HouseTwo buildBedroom");
	}

	@Override
	protected void buildLivingroom() {
		// TODO Auto-generated method stub
		System.out.println("HouseTwo buildLivingroom");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseTwo houseTwo2 = new HouseTwo("big house",true);
		houseTwo2.toBuild();
	}

}
