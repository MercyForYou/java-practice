package java_practice;

public class Person2 {
	String name;
	float height;
	float weight;
	
	public Person2() {}	// 디폴트 생성자
	
	public Person2(String pname) {	// 이름을 매개변수로 입력받는 생성자
		name = pname;
	}

	public Person2(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}	// 이름, 키, 몸무게를 매개변수로 입력받는 생성자
}
