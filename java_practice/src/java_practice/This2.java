package java_practice;

public class This2 {
	String name;
	int age;
	
	public This2() {
		this("이름없음", 1);
	}
	
	public This2(String name, int age) {
		this.name = name;
		this.age = age;
	}
}	// 생성자에서 다른 생성자를 호출하는 this
	// 생성자가 여러 개이고 파라미터만 다른 경우, 생성자 오버로드라고 함
