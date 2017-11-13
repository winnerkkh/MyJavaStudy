package p01.References;
/* *
 * 다차원배열(2차원배열)
 *  - 1차원배열을 묶어서 하나로 만든 배열.
 *  - Java에서 배열은 반드시 길이를 미리 지정해서 선언해야함.
 *  - 값을 저장시 index범위를 벗어나면 오류발생
 *  - index번호는 반드시 0번부터 시작.
 * */
public class MultiArray01Example {
	public static void main(String[] args) {
		//이차원 배열 객체 생성
		//1차원배열의 길이가3인 배열이 두개 합쳐져서 만들어진 2차원배열
		//[3]1차원배열의 길이,[2]1차원 배열객체의 갯수
		int[][] a = new int[2][3]; //2행3열의 2차원 배열
		//이차원이므로 타입[][] = new 타입[행의수][열의수];
		a[0][0]=7; a[0][1] = 23; a[0][2]=11;
		a[1][0]=27; a[1][1] = 2; a[1][2]=13;
		
		System.out.println(a.length); //출력값 2; a[2][3] 에서 [2]
		System.out.println("-----------------");
		// =>중첩 for문
		for(int i=0;i<a.length;i++) { // a.length는 1차원 배열의 갯수 의미
			for(int j=0; j<a[i].length; j++) { //a[행].length
				
				System.out.print(a[i][j]+ "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		//향상된 for문(for each) 이용한 출력
		// a[0] -> a[0][0] a[0][1] a[0][2]
		// a[1] -> a[1][0] a[1][1] a[1][2]
		for(int[] i:a) {//이차원배열의 반복자변수 선언
			            //int[][] a => int[] 변수:a
			for(int  j:i) {//int[] i=> int 변수:i
				           // 0번행: 7,23,11
				           // 1번행: 27,2,13
				System.out.print(j+"\t");
			}
		System.out.println();
		}
	}
}