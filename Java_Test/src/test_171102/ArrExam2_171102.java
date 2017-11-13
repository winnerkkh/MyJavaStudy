package test_171102;

import java.util.Scanner;
public class ArrExam2_171102 {
	public static void main(String[] args) {
		boolean run = true;
		boolean run2 = true;
		int studentNum = 0;
		int[] scores = null;
		int[] backUpScores = null;
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
			System.out.println("----------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택>");
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				//입력한 숫자 길이의 1차원 배열 생성
				//ex) 5를 입력했다면 5개의 길이의 1차원 배열 생성
				// scores = {1,2,3,4,5}
				System.out.println("총 학생수를 입력하세요!!(숫자로만)");
				studentNum=scanner.nextInt();
				scores = new int[studentNum];
				backUpScores = new int[studentNum];
				System.out.println(studentNum+ "명의 학생을 입력하였습니다!");	
			}
			
			else if(selectNo==2) {
				//점수 입력
				for(int i=0; i<scores.length; i++ ) {
					System.out.println((i+1)+"번째 학생의 점수를 입력해주세요");
					scores[i]=scanner.nextInt();
					backUpScores[i]=scores[i];
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
				
				//do while로 사용
				do {
					
					System.out.println();
					System.out.println("--------------------------------------");
					System.out.println("1.오름차순 정렬|2.내림차순 정렬|3.등급|4.종료");
					System.out.println("--------------------------------------");
					System.out.print("선택>");
					
					
					
					int selectNo2 = scanner.nextInt();
					if(selectNo2== 1) {
					//오름차순 정렬
			
						int temp=0;
						
						for(int i=0; i<scores.length; i++) {
							for(int j=i+1; j<scores.length; j++) {
								if(scores[i]>scores[j]) { 
									temp =scores[i];
									scores[i] = scores[j];
									scores[j] = temp;
								}
							}
						}
						
						System.out.println("학생들의 점수 오름차순 정렬은 다음과 같습니다.");
						System.out.print("{");
						for(int j:scores) {
							System.out.print(j + ",");
						}
						System.out.println("}");		
					}	
								
					else if(selectNo2==2) {
					//내림차순 정렬
						int temp=0;
						
						for(int i=0; i<scores.length; i++) {
							for(int j=i+1; j<scores.length; j++) {
								if(scores[i]<scores[j]) {
									temp =scores[i];
									scores[i] = scores[j];
									scores[j] = temp;
								}
							}
						}
						
						
						System.out.println("학생들의 점수 내림차순 정렬은 다음과 같습니다.");
						System.out.print("{");
						for(int j:scores) {
							System.out.print(j + ",");
						}
						System.out.println("}");
					}	
			
	
					
					else if(selectNo2==3) {
					   
						char grade = ' ';//초기화
						System.out.println("학생들의 등급은 다음과 같습니다.");
						int counter2=0;
						for(int i= 0; i<scores.length; i++) {
							counter2++;
							grade = backUpScores[i]>=90?'A':backUpScores[i]>=80?'B':backUpScores[i]>=70?'C':backUpScores[i]>=60?'D':'F';
							System.out.println(counter2+"번째 학생의 등급은 " + grade + " 입니다^^");
						}	
					}
					
					else if(selectNo2==4) {
						run2 =false; //종료
					}

				} while(run2==true);
	
			}
			
			else if(selectNo==5) {
				run =false; //종료
			}
			
		}//while문 종료
		System.out.println("종료");
	}

}
