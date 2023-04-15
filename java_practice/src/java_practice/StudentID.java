package java_practice;

public class StudentID {
	public static int serialNum = 1000;
	public String studentName;
	public int studentID;
	
	public StudentID(String name) {
		serialNum++;
		this.studentName = name;
		studentID = serialNum;
	}
}
