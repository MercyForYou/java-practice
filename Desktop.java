package java_practice;

public class Desktop extends Computer{
	public void display() {
		System.out.println("Desktop display()");
	}
	
	public void typing() {
		System.out.println("Desktop typing()");
	}
}
// 상속받은 추상 클래스의 추상 메서드를 모두 구현하면 일반 클래스로 선언
// 구현하지 않으려면 반드시 추상 클래스로 선언해야 함