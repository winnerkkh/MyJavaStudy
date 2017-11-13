package p03.systems;

public class GcExample {
	public static void main(String[] args) {
	Employee emp;//객체 선언
	
	emp = new Employee(1);//객체 생성 및 대입
	emp = null;//객체와 의 연결이 끊어짐. Employee(1)은 쓰레기가 됨
	emp = new Employee(2);
	emp = new Employee(3);//employee(2)와의 연결이 끊어지고,
	                      //employee(3)과 연결-> employee(2) 쓰레기가 됨.
	System.out.println("emp가 최종적으로 참조하는 사원번호:");
	System.out.println(emp.eno);
	System.gc(); //쓰레기 수집기(garbageCollector)실행 요청
				 // 기존의 없어지지 않고 존재하는 객체들을 강제적으로 스레기 수집기에 집어넣는것을 요청
	
	//이런게 있다라고 참고정도로 알아두면 좋음
	//왜냐하면 요즘에는 시스템 및 사양이 너무 좋기 때문임.
	}

}
