package java_practice;

public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("�Ǹ� �ֹ�");
	}
}
