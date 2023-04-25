package java_practice;
import java.util.ArrayList;

public class CustomerTest3 {
	public static void main(String[] args) {
		ArrayList<Customer2> customerList = new ArrayList<Customer2>();
		
		// ��ĳ���� -> ������ �����ϱ� ���ؼ�
		Customer2 customerLee = new Customer2(10010, "�̼���");
		Customer2 customerShin = new Customer2(10020, "�Ż��Ӵ�");
		Customer2 customerHong = new GoldCustomer2(10030, "ȫ�浿");
		Customer2 customerYoul = new GoldCustomer2(10040, "������");
		Customer2 customerKim = new VIPCustomer2(10050, "������", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		// �� ���� ���
		for(Customer2 customer2 : customerList) {
			System.out.println(customer2.showCustomerInfo());	// ���� �޼���
		}
		
		// ���� �ݾװ� ���ʽ� ����Ʈ ���
		int price = 10000;
		for(Customer2 customer2 : customerList) {
			System.out.println("���ұݾ�: " + customer2.calcPrice(price));	// ���� �޼���
			System.out.println("���ʽ�����Ʈ: " + customer2.bonusPoint);
		}
	}
}
