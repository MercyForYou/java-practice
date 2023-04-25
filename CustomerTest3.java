package java_practice;
import java.util.ArrayList;

public class CustomerTest3 {
	public static void main(String[] args) {
		ArrayList<Customer2> customerList = new ArrayList<Customer2>();
		
		// 업캐스팅 -> 다형성 구현하기 위해서
		Customer2 customerLee = new Customer2(10010, "이순신");
		Customer2 customerShin = new Customer2(10020, "신사임당");
		Customer2 customerHong = new GoldCustomer2(10030, "홍길동");
		Customer2 customerYoul = new GoldCustomer2(10040, "이율곡");
		Customer2 customerKim = new VIPCustomer2(10050, "김유신", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		// 고객 정보 출력
		for(Customer2 customer2 : customerList) {
			System.out.println(customer2.showCustomerInfo());	// 가상 메서드
		}
		
		// 지불 금액과 보너스 포인트 계산
		int price = 10000;
		for(Customer2 customer2 : customerList) {
			System.out.println("지불금액: " + customer2.calcPrice(price));	// 가상 메서드
			System.out.println("보너스포인트: " + customer2.bonusPoint);
		}
	}
}
