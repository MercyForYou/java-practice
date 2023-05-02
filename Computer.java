package java_practice;

public abstract class Computer {
	public abstract void display();
	
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켬");
	}
	public void turnOff() {
		System.out.println("전원을 끔");
	}
}
// 추상클래스 오류 1
// 추상 메서드는 키워드 abstract 사용해야 함

// 추상클래스 오류 2
// 추상 메서드를 포함한 클래스는 추상 클래스로 선언해야 함
