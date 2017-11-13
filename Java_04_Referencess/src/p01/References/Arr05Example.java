package p01.References;
//array점수 구하기
//타입[][] 2차원 배열


public class Arr05Example {
	public static void main(String[] args) {
		int sum =0;
		double average =0;
		int total = 0;
		int count =0;
		String[] title = {"이름","국어","영어","수학","총점","평균"};
		String[] name = {"일지매","이순신","임꺽정","홍길동"};
		
		int[][] score = {{90,80,70},{76,86,90},{90,78,90},{80,80,80}};
		System.out.println("성적표\n");
		for(String t:title) {
			System.out.print(t+"\t");
		}
		System.out.println();
		
		for(int i=0; i<44; i++) {
			System.out.print("=");
		}
		System.out.println();
		
		for(int i=0; i<score.length; i++) {
			//이름 출력
			System.out.print(name[i]+"\t");
		
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				sum +=score[i][j];
				average= sum/score[i].length;
			}

			
			System.out.print(sum+"\t");
			sum = 0;   //누적이 됨으로 초기화를 다시 시켜줘야함
			System.out.print(average);
			
		System.out.println();
		}//이름 점수 출력 끝
		

		for(int i=0;i<44;i++) {
			System.out.print("=");
		}
		
		
		System.out.println();
		System.out.print("합계"+"\t");
		for(int j=0; j<score[j].length; j++) {
			for(int i=0; i<score.length; i++) {
				sum += score[i][j];
			
			}
			total += sum;
			System.out.print(sum +"\t");
			sum=0;
			count++;
		}
		
		System.out.print(total  +"\t");
		System.out.print(total/count  +"\t");
		
	}
}

//score[1][1]
//score[2][1]
//score[3][1]
//score[4][1]