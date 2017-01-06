package Model;

import java.util.Date;

public class Transaction {
	private int type;
	private String txnumber;
	private Date txdate;
	private String Description;
	private Double amount;
	
	private String cardnumber;
	private Date edate;
	private String verifiednum;
	private String nameoncard;
	
	public Transaction(){
		// TODO Auto-generated constructor stub
	}

	

	public Transaction(int tupe, String txnumber, Date txdate, String description, Double amount, String cardnumber, Date edate,
			String verifiednum, String nameoncard) {
		super();
		this.type = type;
		this.txnumber = txnumber;
		this.txdate = txdate;
		Description = description;
		this.amount = amount;
		this.cardnumber = cardnumber;
		this.edate = edate;
		this.verifiednum = verifiednum;
		this.nameoncard = nameoncard;
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



	public int getType() {
		return type;
	}



	public void setType(int type) {
		this.type = type;
	}



	public String getCardnumber() {
		return cardnumber;
	}



	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}



	public Date getEdate() {
		return edate;
	}



	public void setEdate(Date edate) {
		this.edate = edate;
	}



	public String getVerifiednum() {
		return verifiednum;
	}



	public void setVerifiednum(String verifiednum) {
		this.verifiednum = verifiednum;
	}



	public String getNameoncard() {
		return nameoncard;
	}



	public void setNameoncard(String nameoncard) {
		this.nameoncard = nameoncard;
	}
	
}
