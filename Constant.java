package java_practice;

public class Constant {
	int num = 10;
	final int NUM = 100;
	
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50;
		cons.NUM = 200;	// ����: final�� ������ �Ұ�
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}
}
