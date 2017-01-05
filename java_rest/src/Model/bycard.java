package Model;

import java.util.Date;

public class bycard extends Transaction {
	private String cardnumber;
	private Date edate;
	private String verifiednum;
	private String nameoncard;
	public bycard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public bycard(String txnumber, Date txdate, String description, Double amount,
			String cardnumber, Date edate, String verifiednum, String nameoncard) {
		super(txnumber, txdate, description, amount);
		this.cardnumber = cardnumber;
		this.edate = edate;
		this.verifiednum = verifiednum;
		this.nameoncard = nameoncard;
		// TODO Auto-generated constructor stub
	}
	public bycard(String cardnumber, Date edate, String verifiednum, String nameoncard) {
		super();
		this.cardnumber = cardnumber;
		this.edate = edate;
		this.verifiednum = verifiednum;
		this.nameoncard = nameoncard;
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
