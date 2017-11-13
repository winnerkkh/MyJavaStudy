package p01.fors;

import java.util.Scanner;

/* *
 * for((1)초기식; (2)점검식 (3)증감식){
 * 			(4)실행문;				
 * }
 * 
 * */
public class ForExample6 {
	public static void main(String[] args) {
		//구구단 출력 => 가로 방향
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i+ " x " + j + " = " + i*j+"\t" ); //줄을 바꾸지 않고 계속 이어서 출력
			}
			System.out.println();// 출력 후 새로운 줄로 이동
		}
			System.out.print("\n");
			
		//구구단 출력 => 세로 방향              
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+ " x " + i + " = " + i*j+"\t");
			}
			System.out.print("\n");
		}
		         
			System.out.print("\n");
			
			
			
			
		// 값을 입력받아서 2단부터 입력받은 단수까지
		// 구구단을 출력
			boolean isContinue=true;
			Scanner scanner = new Scanner(System.in);
			while(isContinue) {
				System.out.println("출력할 구구단의 단수를 입력하세요.");
				int num = scanner.nextInt();
				for(int i=1; i<=9; i++) {
					for(int j=2; j<=num; j++) {
					System.out.print(j+ " x " + i + " = " + i*j+"\t");
					}
					System.out.print("\n");
				}
				
				System.out.println("계속 하시겠습니까?");
				char c = scanner.next().charAt(0);
				if(!(c=='y'|| c=='Y')){
					isContinue = false; 
				   }
				else {
					isContinue= true;
				}
			}
		
				System.out.println("종료");

		
	}
}
