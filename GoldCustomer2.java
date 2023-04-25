package java_practice;

public class GoldCustomer2 extends Customer2{
	double saleRatio;
	
	public GoldCustomer2(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	public int calcPrice(int price) {	// 메서드 오버라이딩
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showCustomerInfo() {	// 메서드 오버라이딩
		return "골드고객";
	}
}
