package p02.Variables;
/**
 * 
 * -static메소드에서 사용될 변수는
 *	반드시 static으로 선언되야함.
 * -클래스내에서 선언된 전역변수는
 *  초기화 하지 않으면 해당 데이타 타입의 초기값으로 초기화됨
 *  int는 0, String null, 배열 null로 초기화됨.
 * - 로컬변수 메소드내에서 선언되는 변수들은 반드시 초기화 해줘야함.
 *
 **/


public class VariableScopeEx2 {
	
	//전역변수 선언
	static int i; // 전역변수는 초기화를 하지 않으면
				  //해당 데이타 타입의 초기값으로 초기화 됨.
	
	
	public static void main(String[] args) {
		//로컬 변수 선언
		int j=0;
		System.out.println("i="+i); //오류발생 (전역변수선언시 static을 붙여줘야함)
		System.out.println("j="+j); //오류발생 "초기화를 안해서 오류발생"
		
		
		
	}
}
