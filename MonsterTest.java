package java_practice;

public class MonsterTest {
	public static void main(String[] args) {
		Monster[] m = new Monster[3];
		m[0] = new Vampire();
		m[1] = new Dragon();
		m[2] = new Monster();
		
		for(int i = 0; i < 3; i++) {
			m[i].frighten();
		}
	}
}
