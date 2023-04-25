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
		// ��ĳ����
		aList.add(new Human());
		aList.add(new Tiger());
		aList.add(new Eagle());
		
		for(Animal animal : aList) {
			animal.move();	// ���� �޼���
		}
	}
	
	public void testCasting() {
		for(int i = 0; i < aList.size(); i++) {
			Animal ani = aList.get(i);
			
			if(ani instanceof Human) {
				Human h = (Human)ani;	// �ٿ�ĳ����
				h.readBook();
			}
			else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;	// �ٿ�ĳ����
				t.hunting();
			}
			else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;	// �ٿ�ĳ����
				e.flying();
			}
			else {
				System.out.println("�������� ����");
			}
		}
	}
}
