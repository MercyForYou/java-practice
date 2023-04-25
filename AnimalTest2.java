package java_practice;
import java.util.ArrayList;

public class AnimalTest2 {
	ArrayList<Animal> aList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		AnimalTest2 aTest = new AnimalTest2();
		aTest.addAnimal();
		aTest.testCasting();
	}
	
	public void addAnimal() {
		// 업캐스팅
		aList.add(new Human());
		aList.add(new Tiger());
		aList.add(new Eagle());
		
		for(Animal animal : aList) {
			animal.move();	// 가상 메서드
		}
	}
	
	public void testCasting() {
		for(int i = 0; i < aList.size(); i++) {
			Animal ani = aList.get(i);
			
			if(ani instanceof Human) {
				Human h = (Human)ani;	// 다운캐스팅
				h.readBook();
			}
			else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;	// 다운캐스팅
				t.hunting();
			}
			else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;	// 다운캐스팅
				e.flying();
			}
			else {
				System.out.println("지원되지 않음");
			}
		}
	}
}
