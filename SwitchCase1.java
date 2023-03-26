package java_practice;

public class SwitchCase1 {
	public static void main(String[] args) {
		int rank = 3;
		char medalColor;
		
		switch(rank) {
		case 1 : medalColor = 'G';
			break;
		case 2 : medalColor = 'S';
			break;
		case 3 : medalColor = 'B';
			break;
		default : medalColor = 'A';
		}
		System.out.println(medalColor);
	}
}
