package java_practice;

// ���� ��� ������ ���ų� ��� ��Ⱑ ���� ���� �������� ����մϴ�.
public class LeastJob implements Scheduler{
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}
	
	public void sendCallToAgent() {
		System.out.println("���� ��� ������ ���ų� ��� ��Ⱑ ���� ���� �������� �Ҵ��մϴ�.");
	}
}