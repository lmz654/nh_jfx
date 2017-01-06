package Model;

public class Food {
	private String name;
	private int type;//drink, food,extra
	private int category;//soft drink, alcohol or chiken, port, beef... just for future
	private int price;
	public Food() {
		// TODO Auto-generated constructor stub
	}
	public Food(String name, int type, int category, int price) {
		super();
		this.name = name;
		this.type = type;
		this.category = category;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
