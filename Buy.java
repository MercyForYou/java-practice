package java_practice;

public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("���� �ֹ�");
	}
}
