package java_practice;

public abstract class NoteBook extends Computer{
	// Override
	public void display() {
		System.out.println("NoteBook display()");
	}
}
// 추상 클래스 Computer를 상속받았지만
// 추상 메서드 2개를 모두 구현하지 않았기 때문에 추상 클래스로 선언