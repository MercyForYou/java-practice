package java_practice;

public class CalculatorDemo4 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOperands(20, 30);
		c2.sum();
		c2.avg();
	}
}
