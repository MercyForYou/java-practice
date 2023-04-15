package java_practice;

public class StudentObject {
	public String studentName;
	public int grade;
	public int money;
	
	public StudentObject(String name, int money) {
		this.studentName = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
}
