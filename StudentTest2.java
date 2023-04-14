package java_practice;

public class StudentTest2 {
	public static void main(String[] args) {
		StudentPractice student1 = new StudentPractice();
		student1.setStudentName("홍길동");
		
		System.out.println(student1.getStudentName());
		
		StudentPractice student2 = new StudentPractice();
		student2.setStudentName("이순신");
		
		System.out.println(student2.getStudentName());
	}
}
