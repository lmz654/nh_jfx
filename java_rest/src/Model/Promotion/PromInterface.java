package Model.Promotion;

import Model.Receipt;

public abstract class PromInterface {
	private String name;
	
	
	public PromInterface() {
		// TODO Auto-generated constructor stub
	}
	
	
	public PromInterface(String name) {
		super();
		this.name = name;
	}


	abstract void Affect(Receipt rc);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
