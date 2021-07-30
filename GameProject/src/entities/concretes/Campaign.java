package entities.concretes;

public class Campaign {
	private int id;
	private String name;
	private int discountPercentage;
	public Campaign() {}
	public Campaign(int id, String name, int discountPercentage) {
		super();
		this.id = id;
		this.name = name;
		this.discountPercentage = discountPercentage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	

}
