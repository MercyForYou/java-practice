package java_practice;

public class Eagle extends Animal{
	public void move() {	// 메서드 오버라이딩
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 납니다.");
	}
}
