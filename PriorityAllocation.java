package java_practice;

// �� ����� ���� ������ ��⿭���� ������ ���� �ɷ��� ���� ���� �켱���� ����մϴ�.
public class PriorityAllocation implements Scheduler{
	public void getNextCall() {
		System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
	}
	
	public void sendCallToAgent() {
		System.out.println("���� skil ���� ���� �������� �켱������ ����մϴ�.");
	}
}
