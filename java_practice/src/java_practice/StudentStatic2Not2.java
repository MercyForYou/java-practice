package java_practice;

public class StudentStatic2Not2 {
	private static int serialNum = 1000;
	public String studentName;
	public int studentID;
	
	public StudentStatic2Not2() {
		serialNum++;
		studentID = serialNum;
	}
	
	public static int getSerialNum() {
		studentID = serialNum;	// static 메서드는 인스턴스 변수가 생성됐는지 모름
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		StudentStatic2Not2.serialNum = serialNum;
	}
}
