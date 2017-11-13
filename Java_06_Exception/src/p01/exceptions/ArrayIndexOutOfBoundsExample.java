package p01.exceptions;
/* *
 * main()함수의 String[] args는 가변형 배열
 * 입력되는 argument갯수에 따라 길이가 정해지는 특이한 배열
 * 
 * */
public class ArrayIndexOutOfBoundsExample {
	public static void main(String[] args) {
		try{
			String data1 = args[0];
			String data2 = args[1];
			
			//실행시에 입력되는 값에 따라 정상 처리될수도 있고,
			//예외가 발생할수도 있음.
			System.out.println("args[0]:"+data1);
			System.out.println("args[1]:"+data2);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			//getMessage() -예외객체의 메세지를 받아서 출력하는 메소드
		}
	}
}
