package p01.References;
/* *
 * 가변길이 이차원 배열
 * */
public class MultiArray04Example {
	public static void main(String[] args) {
	 int sum=0;
	 double average = 0;
	 int count=0;
	 int[][] a= {{12,34,32},{21,54,76,23},{12,65}};//1차원초기값으로 2차원배열 생성
	 for(int i=0;i<a.length;i++) {
		 for(int j=0;j<a[i].length;j++) {
			 System.out.print(a[i][j]+"\t");
		 }//안쪽 for문 끝
		 System.out.println();
	 }//바깥쪽 for문 끝.
	 System.out.println("-------------------------------");
	 
	 //향샹된 for문
	 for(int[] i:a) {
		 for(int j:i) {
				System.out.print(j+"\t");
				sum+=j;//합계 구하기
				++count;//
			 
		 }//안쪽 for문 끝
		 System.out.println();
		 
	 } //바깥쪽 for문 끝
	 System.out.println("-------------------------------");
		System.out.println("합계:"+sum);
		average = (double)sum/(double)count;
		System.out.println("평균:"+average);
	} //main 메소드 끝
}
