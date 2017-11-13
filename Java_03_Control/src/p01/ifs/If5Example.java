package p01.ifs;

import java.util.Scanner;

public class If5Example {
	public static void main(String[] args) {
		int score= 0;
		String grade = "";
		Scanner keyboard = new Scanner(System.in);
		System.out.print("점수를 입력하세요>");
		score = keyboard.nextInt();
		//if문 시작
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
		} //if문 끝
		
		if(score>=100) grade = "A+";
		else if(score>=60) {//중첩if문
			if(score%10>7) grade +="+";//60%10=>나머지:0~9 >7 : A + "+"  => "A+"          
			else if(score%10<4) grade +="-";//60%10=>나머지:0~9 <4:A +"-" => "A-"
			else grade +="0"; // A + "0" => "A0"
		}
		System.out.println("등급은 "+grade);
	}
}
