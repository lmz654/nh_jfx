package Model;

import java.util.Date;

public class Transaction {
	private String txnumber;
	private Date txdate;
	private String Description;
	private Double amount;
	
	public Transaction(){
		// TODO Auto-generated constructor stub
	}

	public Transaction(String txnumber, Date txdate,String description, Double amount) {
		super();
		this.txnumber = txnumber;
		this.txdate = txdate;
		Description = description;
		this.amount=amount;
	}

	public String getTxnumber() {
		return txnumber;
	}

	public void setTxnumber(String txnumber) {
		this.txnumber = txnumber;
	}

	public Date getTxdate() {
		return txdate;
	}

	public void setTxdate(Date txdate) {
		this.txdate = txdate;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
