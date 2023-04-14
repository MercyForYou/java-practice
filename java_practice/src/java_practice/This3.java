package java_practice;

public class This3 {
	String name;
	int age;
	
	This3() {
		this.name = "noname";	// 오류
		this("이름없음", 1);
	}
	
	This3(String name, int age) {
		this.name = name;
		this.age = age;
	}
}	// this를 사용하여 다른 생성자를 호출할 때 오류 상황
	
	// -> this를 이용하여 다른 생성자 호출할 때는
	//	  그 이전에 어떠한 statement도 사용할 수 없다.
