package Model;

import java.util.Date;
import java.util.List;

import Model.Promotion.PromInterface;

public class Receipt {
	private long orderid;
	private Employee pincharge;
	private Date datecreate;
	private List<Order> lorder;//can be sord by type
	private List<PromInterface> lpromotion;
	private List<Transaction> lpaidtx;
	private double price;
}
