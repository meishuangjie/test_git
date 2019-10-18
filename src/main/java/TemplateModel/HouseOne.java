package TemplateModel;

public class HouseOne extends BuildHouse {

	public HouseOne(String houseName, boolean isBuildLivingroom) {
		super(houseName, isBuildLivingroom);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void buildKitchen() {
		// TODO Auto-generated method stub
		System.out.println("HouseOne buildKitchen");
	}

	@Override
	protected void buildToilet() {
		// TODO Auto-generated method stub
		System.out.println("HouseOne buildToilet");
	}

	@Override
	protected void buildBedroom() {
		// TODO Auto-generated method stub
		System.out.println("HouseOne buildBedroom");
	}

	@Override
	protected void buildLivingroom() {
		// TODO Auto-generated method stub
		System.out.println("HouseOne buildLivingroom");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseOne h1 = new HouseOne("big house",false);
		h1.toBuild();
	}

}
