package java_practice;

public class StudentStaticTest {
	public static void main(String[] args) {
		StudentStatic studentLee = new StudentStatic("LEE");
		System.out.println(studentLee.serialNum);	// 1000 출력
		studentLee.serialNum++;
		
		StudentStatic studentChoi = new StudentStatic("CHOI");
		System.out.println(studentChoi.serialNum);	// 1001 출력
		System.out.println(StudentStatic.serialNum);	// 1001 출력
	}
}
