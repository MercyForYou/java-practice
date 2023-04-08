package java_practice;

public class ReturnTest {
	public static void main(String[] args) {
		 divide(10, 0);
	}
	public static void divide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("It should not be zero");
			return;
		}
		else {
			int result = num1 / num2;
			System.out.println(result);
		}
	}
}
