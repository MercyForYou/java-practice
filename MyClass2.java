package java_practice;

public class MyClass2 implements MyInterface {
	@Override
	public void x() {
		System.out.println("x()");	// X �������̽����� ��ӹ��� x() �޼��� ����
	}
	
	@Override
	public void y() {
		System.out.println("y()");	// Y �������̽����� ��ӹ��� y() �޼��� ����
	}
	
	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}	// MyInterface �������̽��� myMethod() �޼��� ����
}
