package java_practice;

public class StudentStatic2Not {
	private static int serialNum = 1000;
	public String studentName;
	public int studentID;
	
	public StudentStatic2Not() {
		serialNum++;
		studentID = serialNum;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		this.serialNum = serialNum;		// static �޼��忡 this �� ��
	}									// this ��� Ŭ���� �̸� ��ߵ�
}
