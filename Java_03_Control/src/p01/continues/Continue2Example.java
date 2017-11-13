package p01.continues;

/* *
 * Continue문;
 * */
public class Continue2Example {
	public static void main(String[] args) {
		for(int i=0; i<=10; i++){
			for(int j=0; j<=10; j++) {
				System.out.println("j= " + j);
				if(j>2) continue; //j가 2보다 크면 아래부분을 실행하지 않고 반복함
				System.out.println("j 출력");
			}
			System.out.println("i= " +i);
		}
	}

}
