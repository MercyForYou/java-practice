package java_practice;

public class MyDate2 {
	private int day;
	private int month;
	private int year;
	
	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("�����Դϴ�");
			}
			else {
				this.day = day;
				System.out.println(this.day);
			}
		}
	}
	public static void main(String[] args) {
		MyDate2 date = new MyDate2();
		date.month = 2;
		date.setDay(27);
	}
}	// private���� �����ؼ�
	// ��¥�� ������ ����Ǳ� ���� üũ�Ͽ� ������ ������ �� ����
