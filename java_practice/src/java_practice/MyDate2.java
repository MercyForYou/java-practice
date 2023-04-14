package java_practice;

public class MyDate2 {
	private int day;
	private int month;
	private int year;
	
	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("오류입니다");
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
}	// private으로 선언해서
	// 날짜가 변수에 저장되기 전에 체크하여 오류를 방지할 수 있음
