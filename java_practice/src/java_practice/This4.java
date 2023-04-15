package java_practice;

public class This4 {
	String name;
	boolean married;
	int numberOfChild;
	int age;
	
	This4 getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		This4 p = new This4();
		p.name = "James";
		p.married = true;
		p.numberOfChild = 3;
		p.age = 40;
		
		This4 p2 = p.getPerson();
		System.out.println(p2.age);
	}
}	// 자신의 주소를 반환하는 this
