package p01.ifs;

import java.util.Scanner;

/* *
 * 중첩if - if문 내에 if문이 존재
 * 		 - 대분류 후 소분류 식으로 구분을 줘야하는 경우 주로 사용  
 * */

public class If4Example {
	public static void main(String[] args) {
		//로컬변수 선언, 초기화
		boolean isContinue=true;
		int score=0;
		String grade = ""; //문자열의 초기화"", cf.문자의 초기화' '
		Scanner keyboard = new Scanner(System.in);
		// Integer.parseInt(); 숫자형 문자열의 값을 숫자(int)로 변환하는 메소드
		while(isContinue) {
		System.out.print("점수를 입력하세요>");
		score = Integer.parseInt(keyboard.next());
		//A(A+, A0, A-)
		if(score>=90) {
			if(score>96) {
				grade = "A+";
			}
			else if(score<94){
				grade ="A-";
			}
			else {
				grade = "A0";
			}
		}
		else if(score>=80) {
			if(score>86) {
				grade = "B+";
			}
			else if(score<84){
				grade ="B-";
			}
			else {
				grade = "B0";
			}
		}
		else if(score>=70) {
			if(score>76) {
				grade = "C+";
			}
			else if(score<74){
				grade ="C-";
			}
			else {
				grade = "C0";
			}
		}
		else if(score>=60) {
			if(score>66) {
				grade = "D+";
			}
			else if(score<64){
				grade ="D-";
			}
			else {
				grade = "D0";
			}
		}
		else {
			grade="F"; // 제어문 끝
		}
		System.out.println("결과: " + grade);
		System.out.println("계속 하시겟습니까?");
		char yesNo =keyboard.next().charAt(0); 
		//if(true||false)인경우 왼쪽이 true이므로 한번만 입력받음
		//if(false||true) 인경우 왼쪽이 false이므로 오른쪽또 false/true여부확인하기 위해 한번더 입력받음
	    //if(keyboard.next().charAt(0)=='y'||keyboard.next().charAt(0)=='Y')
		if(yesNo =='y' ||yesNo =='Y' ) {
			isContinue = true;
		}
		else {
			isContinue = false;
		}
		System.out.println("종료");
		}// while문 끝
	} //main 메소드 끝
}
