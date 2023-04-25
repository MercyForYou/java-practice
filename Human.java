package java_practice;

public class Human extends Animal{
	public void move() {	// 메서드 오버라이딩
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
