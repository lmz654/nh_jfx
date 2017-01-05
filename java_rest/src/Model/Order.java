package Model;

import java.util.ArrayList;

public class Order {
	private int type;//togo or dine-in
	private Food food;
	private ArrayList<Extra> lextra;
	private String note;
	private int price;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int type, Food food, ArrayList<Extra> lextra, String note, int price) {
		super();
		this.type = type;
		this.food = food;
		this.lextra = lextra;
		this.note = note;
		this.price = price;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public ArrayList<Extra> getLextra() {
		return lextra;
	}

	public void setLextra(ArrayList<Extra> lextra) {
		this.lextra = lextra;
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
