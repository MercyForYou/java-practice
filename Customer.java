package java_practice;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	// protected ��� private ���� ������� �� ���� Ŭ������ ������ ����
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		//System.out.println("Customer() ������ ȣ��");
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		//System.out.println("Customer(int, String) ������ ȣ��");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerName() {
		return customerName;
	}
}
