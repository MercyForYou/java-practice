package java_practice;

public interface Calc2 {
	// ����Ʈ �޼���
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
		myMethod();	// ����Ʈ �޼��忡�� private �޼��� ȣ��
	}
	
	// ���� �޼���
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();	// ���� �޼��忡�� private static �޼��� ȣ��
		return total;
	}
	
	// private �޼���
	private void myMethod() {
		System.out.println("private �޼����Դϴ�.");
	}
	
	// private static �޼���
	private static void myStaticMethod() {
		System.out.println("private static �޼����Դϴ�.");
	}
}
