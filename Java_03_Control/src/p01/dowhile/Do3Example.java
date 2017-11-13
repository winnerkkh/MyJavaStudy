package p01.dowhile;

import java.util.Scanner;

/* *
 * do~while()문
 * */
public class Do3Example {
	public static void main(String[] args) {
		int num=0,i=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("프로그램을 종료하려면 'a'를 입력하세요!");
		do {
			System.out.println("숫자를 입력하세요!");
		    //num = System.in.read() -'0';//read()메소드는 리턴시 "\n"까지 출력
		    //System.in.read();//CR
		    //System.in.read();//LF
			//next()메소드는 키보드로 입력한 String타입이 문자값+"\n"을 읽어들임
		    //next()메소드는 리턴시 "\n"문자는 생략하고 입력한 문자값만 출력
			
			num = (int)scanner.next().charAt(0) -'0';//char ->int타입 자동형변환
			System.out.println("num=" + num);
			if(num>=2 && num<=9) {
				while(i<=9) {
					System.out.println(num+"X"+i+"="+i*num);
					i++;
				}
			}
			i=1;
		}while(num!=49); //입력받은 값이 'a'이면 종료
		System.out.println("프로그램 종료");

	}

}
