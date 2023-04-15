package java_practice;

public class Subway {
	public String lineNumber;
	public int passengerCount;
	public int money;
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
}
