package java_practice;

public class Transportation {
	public static void main(String[] args) {
		StudentObject studentJames = new StudentObject("James", 5000);
		StudentObject studentTomas = new StudentObject("Tomas", 10000);
		
		Bus bus34 = new Bus();
		studentJames.takeBus(bus34);
		
		Subway subwayGreen = new Subway();
		studentTomas.takeSubway(subwayGreen);
		
		System.out.printf("%d %d", studentJames.money, studentTomas.money);
	}
}
