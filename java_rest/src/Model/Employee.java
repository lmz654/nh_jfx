package Model;

public class Employee {
	private int type;//owner, waiter, chef, manager
	private String username;
	private String password;
	private Person person;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int type, String username, String password, Person person) {
		super();
		this.type = type;
		this.username = username;
		this.password = password;
		this.person = person;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
