package java_practice;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.month = 2;
		date.day = 31;
		date.year = 2018;
		
		System.out.println(date.day);
	}
}
// private으로 안 하고 public으로 선언해서
// 2월에 31일이 존재하지 않는데 오류를 막을 수 없음