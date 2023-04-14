package java_practice;

public class Man {
	int Age = 40;
	String Name = "James";
	boolean Married = true;
	int Children = 3;
	
	public static void main(String[] args) {
		Man m = new Man();
		System.out.println("Age: " + m.Age);
		System.out.println("Name: " + m.Name);
		System.out.println("Married: " + m.Married);
		System.out.println("Children: " + m.Children);
	}
}
