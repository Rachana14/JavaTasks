import java.util.Date;
public class Order {
	static String itemname;
	static int itemID;
	String paymentMethod;
	static float amount;
	int orderID;
	private Date orderDate;
	public void Order()
	{
		orderDate = new Date();
	}
	protected  void printItems(String itemname, int itemid)
	{
	  
	}
	protected static void printItems(String itemaname, int itemid, float amount)
	{
		
	}
	
	public Date getorderdate()
	{
		return orderDate;
	}
	public float total()
	{
		return amount;
	}
	
	}
