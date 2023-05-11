package java_practice;

public class CustomerTest4 {
	public static void main(String[] args) {
		Customer3 customer = new Customer3();
		
	// Customer3 클래스형인 customer를 Buy 인터페이스형인 buyer에 대입하여 형 변환
	// buyer는 Buy 인터페이스의 메서드만 호출 가능
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
	// seller를 하위 클래스형인 Customer로 다시 형 변환 -> 다운캐스팅
		if(seller instanceof Customer) {
			Customer3 customer2 = (Customer3)seller;
			customer2.buy();
			customer2.sell();
		}
	}
}
