package java_practice;

public class Person2 {
	String name;
	float height;
	float weight;
	
	public Person2() {}	// ����Ʈ ������
	
	public Person2(String pname) {	// �̸��� �Ű������� �Է¹޴� ������
		name = pname;
	}

	public Person2(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}	// �̸�, Ű, �����Ը� �Ű������� �Է¹޴� ������
}
