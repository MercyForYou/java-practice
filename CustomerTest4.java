package java_practice;

public class CustomerTest4 {
	public static void main(String[] args) {
		Customer3 customer = new Customer3();
		
	// Customer3 Ŭ�������� customer�� Buy �������̽����� buyer�� �����Ͽ� �� ��ȯ
	// buyer�� Buy �������̽��� �޼��常 ȣ�� ����
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
	// seller�� ���� Ŭ�������� Customer�� �ٽ� �� ��ȯ -> �ٿ�ĳ����
		if(seller instanceof Customer) {
			Customer3 customer2 = (Customer3)seller;
			customer2.buy();
			customer2.sell();
		}
	}
}
