package p01.ifs;
/* *
 * if-else if-else: 둘중 하나인 경우가 아닌 다수의 경우가 발생하는 경우
 * 
 * */


import java.util.Scanner;

public class If3Example {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

	try {
	  while(true){ //while문 시작
		System.out.print("점수를 입력하세요.");
		int score = keyboard.nextInt(); // String타입으로 입력된 숫자형문자열을 숫자로 반환
		String grade = "";//등급
		if(score <0) { //제어를 개발자가 임의로 바꾼경우.
			System.out.println("성적은 0보다 커야 합니다");
			System.out.println("점수를 다시 입력하세요.");
			score = keyboard.nextInt();
		}
		//if - else if -else
		if(score>=90) { //90이상이면 {}실행
			grade = "A";
		}
		else if(score >=80) { //위의 if()문을 제외한 (90미만 80이상) {} 실행
			grade = "B";
		}
		else if(score >=70) { //바로위의 else if()문을 제외한 (80미만 70이상){} 실행
			grade = "C";
		}
		else if(score >=60) { //바로위의 else if()문을 제외한 (70미만 60이상){} 실행
			grade = "D";
		}
		else {
			grade = "F"; //그 외는 {}실행
		}
		
		System.out.println("입력한 점수는 " + grade + "등급 입니다.");
		//출력후 반복여부를 확인
		System.out.println("계속 하시겟습니까?");
		char yesNo = keyboard.next().charAt(0);//()안의 식의 결과가 true이면
		if(!(yesNo == 'y' || yesNo == 'Y')) {
			break;	
		}
	  } //while문 끝
	  System.out.println("종료");
	  //
	}catch(java.util.InputMismatchException e) { //catch시작
		System.out.println(e.getMessage()); //오류출력
	}//catch끝
	
	}
	
}
