package java_practice;

public class Order {
	String NO = "201803120001";
	String ID = "abc123";
	String Date = "2018/03/12";
	String Name = "홍길순";
	String P_NO = "PD0345-12";
	String Address = "서울시 영등포구 여의도동 20번지";
	
	public static void main(String[] args) {
		Order O = new Order();
		
		System.out.println("Order NO: " + O.NO);
		System.out.println("Order ID: " + O.ID);
		System.out.println("Order Date: " + O.Date);
		System.out.println("Order Name: " + O.Name);
		System.out.println("Order Product NO: " + O.P_NO);
		System.out.println("Mailing Address: " + O.Address);
	}
}
