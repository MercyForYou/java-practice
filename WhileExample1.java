package java_practice;

public class WhileExample1 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			if(num % 2 == 0)
				sum += num;
			num++;
		}
		System.out.println("1���� 10������ ¦�� ���� "+ sum +"�Դϴ�.");
	}
}
