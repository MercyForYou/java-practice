package java_practice;

public class ForExample1 {
	public static void main(String[] args) {
		int i;
		int sum;
		for(i = 1, sum = 0; i <= 10; i++) {
			if(i % 2 == 0)
				sum += i;
		}
		
		System.out.println("합은 " + sum + "입니다.");
	}
}
