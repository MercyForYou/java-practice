package java_practice;

public class CalculatorConsumer {
	public static void main(String[] args) {
		CalculatorDummy c = new CalculatorDummy();	// ��¥ Ŭ����
		c.setOperands(10, 20, 30);
		System.out.println(c.sum() + c.avg());
	}
}
