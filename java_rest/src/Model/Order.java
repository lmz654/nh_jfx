package Model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int type;//togo or dine-in
	private List<Food> food;
	//private ArrayList<Extra> lextra;
	private String note;
	private int price;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int type, List<Food> food, String note, int price) {
		super();
		this.type = type;
		this.food = food;
		this.note = note;
		this.price = price;
	}



	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}


	public List<Food> getFood() {
		return food;
	}

	public void setFood(List<Food> food) {
		this.food = food;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}	
}
