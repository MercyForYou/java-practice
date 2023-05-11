package java_practice;

// 고객 등급이 높은 고객부터 대기열에서 가져와 업무 능력이 높은 상담원 우선으로 배분합니다.
public class PriorityAllocation implements Scheduler{
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}
	
	public void sendCallToAgent() {
		System.out.println("업무 skil 값이 높은 상담원에게 우선적으로 배분합니다.");
	}
}
