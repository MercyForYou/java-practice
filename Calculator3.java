package java_practice;

public class Calculator3 implements Calculatable{
	int first, second, third;
	
	public void setOperands(int first, int second, int third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public int sum() {
		return this.first + this.second + this.third;
	}
	
	public int avg() {
		return (this.first + this.second + this.third) / 3;
	}
}
// Calculator2를 수정함 -> 개발자 A가 완료한 클래스