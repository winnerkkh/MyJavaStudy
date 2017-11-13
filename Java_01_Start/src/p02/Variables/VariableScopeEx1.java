package p02.Variables;
/**
 * 변수의 Scope
 * - 클래스 변수 : 전역변수
 * - 전역변수: static변수 / instance변수
 * - static변수는 메모리의 static(메소드)영역에 로드되고.
 * - instance변수는 클래스가 instance객체로 만들어져야 사용할수 있는 변수 \
 * - 접근 : static변수는 클래스명.변수로 접근하고,
 * 		  instance변수는 new 클래스(); 로 생성한 instance변수.변수로 접근
 * 
 * - 전역변수는 클래스내에서 모두 사용가능하고,
 * - 로컬변수는 해당 로컬블록(메소드 블럭, 제어문 블럭, 반복문 불럭
 * 
 **/


public class VariableScopeEx1 {
	
	//매개변수가 없는 default생성자(무조건 Class와 이름이 같아야함)
	VariableScopeEx1(){}
	
	
		static int a; //전역변수, static변수 (객체의 생성없이 사용가능)
		int f; //전역변수, instance 변수(반드시, 객체를 생성 후 사용가능)
		
		
	
	//메소드
	public static void main(String[] args) { //메소드 블록 시작
		int v1 = 15; //로컬 변수
		int v2 = 0;
		
			if(v1>10) { // 제어문 블록의 시작
				v2 = v1-10;
				System.out.println(v2); // 제어문블록 끝
			}

		int v3 = v1+v2+5;
		System.out.println(v3);
		System.out.println(v1);
		System.out.println(VariableScopeEx1.a); //static변수는 객체를 생성
												//클래스명.변수명으로 접근;
		
		
		VariableScopeEx1 ve = new VariableScopeEx1(); // 객체생성
		System.out.println(ve);
		System.out.println(ve.f); //instance변수에 접근하기 위해서는 생성한 객체의 참조변수 .변수명으로 접근
		
		
		
	}
}
