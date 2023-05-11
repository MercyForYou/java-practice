package java_practice;

import java.io.IOException;
public class SchedulerTest {
	public static void main(String[] args) throws IOException {
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���.");
		System.out.println("R: �� ���� ���ʷ� �Ҵ�");
		System.out.println("L: ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
		System.out.println("P: �켱������ ���� ���� ���� �Ҵ�");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		// �������̽��� ��ĳ�����ϵ� ���ǹ��� ���� �ν��Ͻ� ������
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		// �������̽��� Ȱ���� ������ ����
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}