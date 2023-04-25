package java_practice;

public class VIPCustomer2 extends Customer2{
	private int agentID;
	double saleRatio;
	
	public VIPCustomer2(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	public int calcPrice(int price) {	// 메서드 오버라이딩
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showCustomerInfo() {	// 메서드 오버라이딩
		return "VIP 고객";
	}
}
