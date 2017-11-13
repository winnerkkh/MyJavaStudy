package p01.fors;
/* *
 * 반복문(for)
 * */
public class ForExample3 {
	public static void main(String[] args) {
		 for(int i=0;i<=10;i++)//초값 0, 최종값:10 ,증가
			 System.out.print(i+"\t");//tab만큼 띄우면서 출력
		 
		 System.out.println();//아무것도 출력하지않고 새로운줄로 이동
		 
		 for(int i=10;i>=0;i--) {//초기값 10, 최종값:0,감소
			 System.out.print((10-i)+"\t");
		 }
		 System.out.println();
		 
		 for(int i=0;i<=10;i+=2) {//2씩 증가 i=i+2;
			 System.out.print(i+"\t");
		 }
		 
		 System.out.println();
		 for(int i=1;i<=10;i*=2) {//i=i*2
			 System.out.print(i+"\t");
		 }
		 
		}
}
