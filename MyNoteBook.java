package java_practice;

public class MyNoteBook extends NoteBook{
	// Override
	public void typing() {
		System.out.println("MyNoteBook typing()");
	}
}
// 추상 클래스 NoteBook을 상속받음
// NoteBook에서 구현하지 못한 메서드를 마저 구현했기 때문에 일반 클래스로 선언