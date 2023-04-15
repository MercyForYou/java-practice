package java_practice;

public class Bus {
	public String busNumber;
	public int passengerCount;
	public int money;
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
}
