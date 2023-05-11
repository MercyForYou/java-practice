package java_practice;

public abstract class Calculator4 implements Calc {
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
}
// Calc 인터페이스를 상속받아 일부만 구현했기 때문에 추상 클래스
