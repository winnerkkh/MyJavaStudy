package p01.whiles;

import java.util.Scanner;

/* *
 * 중첩 while문
 * */

public class While3Example {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i=1,j=2;//초기값 설정
		boolean isContinue=true;
		
		while(isContinue) {
			System.out.println("구구단의 값을 입력하세요.");
			int num = scanner.nextInt();
			while(i<=9) { //반복문을 빠져나갈수 있는 조건
				while(j<=num) {
					System.out.print(j + "x" + i + "=" + j*i + "\t");	
					j++;//증가식
				}//안쪽 while()문 끝
				
				System.out.println();
				j=2; //다시 초기화
				i++; //바깥쪽 while()문 의 값 증가
			}//바깥쪽 while()문 끝
		
		System.out.println("계속하시겠습니까?");
		
		char c = scanner.next().charAt(0);
		if(!(c=='y'||c=='Y'))
		   isContinue = false;
		else
			isContinue = true;
		
	  }//while문 끝.
		System.out.println("종료");
	}
}
