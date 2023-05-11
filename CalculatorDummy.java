package java_practice;

public class CalculatorDummy implements Calculatable{
	public void setOperands(int first, int second, int third) {
	}

	public int sum() {
		return 60;
	}
	
	public int avg() {
		return 20;
	}
}
// 기존 클래스에 implements 인터페이스 이름 추가하여 수정함 -> 인터페이스 상속 받음