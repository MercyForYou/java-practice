package java_practice;

public class Customer3 implements Buy, Sell {
	@Override
	public void sell() {
		System.out.println("�����ϱ�");
	}
	
	@Override
	public void buy() {
		System.out.println("�Ǹ��ϱ�");
	}
	
	@Override
	public void order() {
		System.out.println("�� �Ǹ� �ֹ�");
	}// ����Ʈ �޼��� order()�� Customer3 Ŭ�������� ��������
}
// Customer3 Ŭ������ Buy�� Sell �������̽��� ��� ������
