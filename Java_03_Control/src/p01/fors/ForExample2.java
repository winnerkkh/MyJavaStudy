package p01.fors;

import java.util.Scanner;

public class ForExample2 {
	public static void main(String[] args) {
		int num=0;
		int vertical = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("출력할 구구단의 단 수를 입력하세요");
		num = keyboard.nextInt();
		
		System.out.println("출력할 기준(가로:1, 세로:2)를 입력하세요");
		vertical = keyboard.nextInt();
		if(vertical ==1)//가로{
		
			if(num>=2 && num<=9) {	
			for(int i=1; i<=9; i++) {
				//System.out.println(num +"x"+i+"= " +num*i+ "\t"); 
				System.out.print(num +"x"+i+"= " +num*i+ "\t"); //tab만큼 공백 띄우기
				}
			}
			
			else if(vertical==2)// 세로
				if(num>=2 && num<=9) {	
					for(int i=1; i<=9; i++) {
						System.out.println(num+"x"+i+"="+num*i+"\t");
						//println()메소드 출력후 아래줄로 이동,("\n");
					}				
				}
	}
}

