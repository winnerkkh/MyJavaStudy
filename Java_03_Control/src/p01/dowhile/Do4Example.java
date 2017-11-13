package p01.dowhile;

import java.util.Scanner;

/* *
 * do~while()문
 * */

public class Do4Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		int num;
		int answer = (int)(Math.random()*100+1); // 1부터 100까지의 임의의 값 발생
		System.out.println(answer);
		do {
			System.out.println("1~100까지의 수중 어느 수있까요??");
			num = sc.nextInt();
			if(answer == num) {
				System.out.println(cnt+"회 만에 성공!");
				break; //반복문 빠져나가기
			}
			
			else if(answer>num) {
				System.out.println("더 큰값을 입력하세요!");
			}
			
			else {
				System.out.println("더 작은 값을 입력하세요!");
				
			}
			cnt++;
			
		}while(true);//조건이 true이므로 무한 반복
		sc.close(); //scanner객체 지원 해제		
	}
}
