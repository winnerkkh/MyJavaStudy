package p01.whiles;

import java.io.IOException;

public class While2 {
	public static void main(String[] args) {
		System.out.println("값을 입력하세요");
		
		try {
			//read(): 입력값 ascii코드값을 리턴
			//ascii코드값 - '0'의 ascii코드값 =>int타입의 변수에 대입
			int num = System.in.read() - '0'; //입출력 처리는 예외가 발생할수 있다.
										      //IOException 예외 발생시 처리해주는 문장이 필요
										      //checkException
										      //실행시에 발생할수 있는 예외를 머리 체크해서
					   					      //처리할 catch(){}문을 추가함.
					
			
			//예) 3입력시 ascii코드값 51이 리턴됨.
			//   원하는 값 3을 얻기 위해서는 3에서 ascii코드값 '0'을 빼면
			//   51- 48 = 3 이됨.
			
			
			
			int i = 1;
			if(num >=2 &&num <=9) { //입력한 값이 2~9사이 이면
				while(i<=9) { //9까지 출력
					System.out.print(num + "x"+i+"=" + num*i +"\t");
					i++; //증가
				}
			}
			
			else {
				System.out.println("2~9까지의 숫자를 입력하세요.");
			}
			
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
