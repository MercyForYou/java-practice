package java_practice;

public class StudentPractice {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		StudentPractice studentHong = new StudentPractice();
		studentHong.setStudentName("Hong");
		
		System.out.println(studentHong.getStudentName());
	}
}
