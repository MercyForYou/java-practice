package java_practice;

public class CompleteCalc extends Calculator4{
	public int times(int num1, int num2) {
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1 / num2;
		else
			return Calc.ERROR;
	}
	
	public int square(int num) {
		return num * num;
	}
	
	public void showInfo() {
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�.");
	}
}
// Calc �������̽��� ��ӹ��� Calculator4 �߻� Ŭ������ ��ӹ���
// ��� �޼��� ���� �� �߱� ������ �Ϲ� Ŭ������ �ν��Ͻ�ȭ ����