package java_practice;

public class DoWhileExample {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			if(num % 2 == 0)
				sum += num;
			num++;
		} while(num <= 10);
		
		System.out.println("합은 " + sum + "입니다.");
	}
}
