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
// private���� �� �ϰ� public���� �����ؼ�
// 2���� 31���� �������� �ʴµ� ������ ���� �� ����