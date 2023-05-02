package java_practice;

public abstract class AbstractTV {
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnoff() {
		System.out.println("전원을 끕니다.");
	}
}
// 모든 추상 메서드를 구현했지만 일반 클래스가 아니라 추상 클래스로 선언함
