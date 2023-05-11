package java_practice;

public class CompleteCalc extends Calculator4{
	public int times(int num1, int num2) {
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1 / num2;
		else
			return Calc.ERROR;
	}
	
	public int square(int num) {
		return num * num;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
}
// Calc 인터페이스를 상속받은 Calculator4 추상 클래스를 상속받음
// 모든 메서드 구현 다 했기 때문에 일반 클래스로 인스턴스화 가능