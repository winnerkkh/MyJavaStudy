package p01.ifs;
/* *
 * if -else 둘 중 하나의 명령문을 실행해야 하는 경우 사용
 * Math.abs() : 클래스.메소드명(); static메소드, 객체생성을 하지 않고
 * 								 클래스명.메소드()형태로 바로 사용할수 있는 메소드.
 * 								 어느 클래스에서든 바로 호출가능(public)
 * 			 	- 수치연산용 클래스 Math클래스, abs()메소드는 절대값을 표시하는 static 메소드.
 * 
 * 
 * 				/static으로 되어 있는 메소드는 객체를 생성하지 않고 바로 클래스로 호출하여 메소드 사용 가능.
 *  */
public class If2Example {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[2]); // main의 매개변수 값
		if(a>0) {
			System.out.println(a+"는 양의 정수 입니다.");
		}
		else {
			System.out.println(a+"는 음의 정수 입니다.");
		}
		System.out.println(a+"의 절대값은 " +  Math.abs(a) + "입니다." );
	}
	
}
