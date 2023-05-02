package java_practice;

public class ComputerTest {
	public static void main(String[] args) {
		Computer c1 = new Computer();	// 인스턴스 생성 못함
		Computer c2 = new Desktop();	// 형 변환 사용 가능
		Computer c3 = new NoteBook();	// 인스턴스 생성 못함
		Computer c4 = new MyNoteBook();	// 형 변환 사용 가능
	}
}	// 인스턴스 생성 못하는 이유: 추상 클래스라서
	// 형 변환 사용 가능한 이유: 메서드를 모두 구현해서 일반 클래스로 선언됨
