package java_practice;

public class This3 {
	String name;
	int age;
	
	This3() {
		this.name = "noname";	// ����
		this("�̸�����", 1);
	}
	
	This3(String name, int age) {
		this.name = name;
		this.age = age;
	}
}	// this�� ����Ͽ� �ٸ� �����ڸ� ȣ���� �� ���� ��Ȳ
	
	// -> this�� �̿��Ͽ� �ٸ� ������ ȣ���� ����
	//	  �� ������ ��� statement�� ����� �� ����.
