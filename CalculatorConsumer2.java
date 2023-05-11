package java_practice;

public class CalculatorConsumer2 {
	public static void main(String[] args) {
		// CalculatorDummy c = new CalculatorDummy();
		Calculator3 c = new Calculator3();
		c.setOperands(10, 20, 30);
		System.out.println(c.sum() + c.avg());
	}
}
// CalculatorConsumer를 수정함