package test_171102;

import java.util.Scanner;
public class ArrExam {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int counter = 0;
		
		/*
		 * Scanner scanner;
		 * scanner = new Scanner(value);
		 */
		
		//참조타입/   참조변수/ = new 셍성자(초기값);
		//Scanner/   scanner/ = new Scanner(System.in)
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println();
			System.out.println("---------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				//입력한 숫자 길이의 1차원 배열 생성
				//ex) 5를 입력했다면 5개의 길이의 1차원 배열 생성
				// scores = {1,2,3,4,5}
				System.out.println("총 학생수를 입력하세요!!(숫자로만)");
				studentNum=scanner.nextInt();
				scores = new int[studentNum];
				System.out.println(studentNum+ "명의 학생을 입력하였습니다!");	
			}
			
			else if(selectNo==2) {
				//점수 입력
				for(int i=0; i<scores.length; i++ ) {
					System.out.println((i+1)+"번째 학생의 점수를 입력해주세요");
					scores[i]=scanner.nextInt();
				}
			}
			
			else if(selectNo==3) {
				//점수 리스트 출력
				for(int j: scores){ 
						counter++;
						System.out.println(counter+"번째 학생의 점수는 " +j );
				}
				
			}	
			
			else if(selectNo==4) {
				run =false; //종료
			}
			
		}//while문 종료
		System.out.println("종료");
	}

}
