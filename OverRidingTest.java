package java_practice;

public class OverRidingTest {
	public static void main(String[] args) {
		int price = 10000;
		
		Customer cLee = new Customer(10010, "�̼���");
		VIPCustomer vKim = new VIPCustomer(10020, "������", 12345);
		Customer vc = new VIPCustomer(10030, "������", 2000);
		
		System.out.println(cLee.calcPrice(price));	// 10000��
		System.out.println(vKim.calcPrice(price));	// 9000��
		System.out.println(vc.calcPrice(price));	// 9000��
	}
}
