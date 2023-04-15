package java_practice;

public class StudentStatic2 {
	private static int serialNum = 1000;
	public String studentName;
	public int studentID;
	
	public StudentStatic2() {
		serialNum++;
		studentID = serialNum;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		StudentStatic2.serialNum = serialNum;
	}
}
