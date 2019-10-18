package buildModel;

public class Productor {

	private String id;
	private String name;
	private float weight;
	private float height;
	
	
	public Productor(String id, String name, float weight, float height) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	public Productor() {
		super();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Productor [id=" + id + ", name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}




	public static class  Builder {
		private String id;
		private String name;
		private float weight;
		private float height;

		public Builder(String id) {
			super();
			this.id = id;
		}
		
		public Builder() {
			super();
		}
		
		public Productor build() {
			Productor pro = new Productor();
			construct(pro);
			return pro;
		}
		
		 private void construct(Productor pro) {
			 pro.setId(id);
			 pro.setName(name);
			 pro.setWeight(weight);
			 pro.setHeight(height);
		 }

		
		public String getId() {
			return id;
		}
		public Builder setId(String id) {
			this.id = id;
			return this;
		}
		public String getName() {
			return name;
		}
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public float getWeight() {
			return weight;
		}
		public Builder setWeight(float weight) {
			this.weight = weight;
			return this;
		}
		public float getHeight() {
			return height;
		}
		public Builder setHeight(float height) {
			this.height = height;
			return this;
		}
	}
}
