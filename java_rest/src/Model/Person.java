package Model;

import java.util.Date;

public class Person {
	private String first;
	private String last;
	private String mid;
	private Date bday;
	private String ss;
	private String phone;
	private String email;
	private String Address;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String first, String last, String mid, Date bday, String ss, String phone, String email,
			String address) {
		super();
		this.first = first;
		this.last = last;
		this.mid = mid;
		this.bday = bday;
		this.ss = ss;
		this.phone = phone;
		this.email = email;
		Address = address;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public Date getBday() {
		return bday;
	}

	public void setBday(Date bday) {
		this.bday = bday;
	}

	public String getSs() {
		return ss;
	}

	public void setSs(String ss) {
		this.ss = ss;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	
	
}
