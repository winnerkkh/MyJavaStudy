package p01.References;
/* *
 * 2차원 배열
 * */

public class MultiArray02Example {
	public static void main(String[] args) {
		//길이가 3인 1차원 배열
		int[][] a = {{12,45,23}, {16,4,879}, {45,87,12}};
		// a[0][0] = 12, a[0][1]=45, a[0][2]=23
		// a[1][0] = 116, a[1][1]=4, a[1][2]=879
		// a[2][0] = 45, a[2][1]=87, a[2][2]=12
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print("a["+i+"]["+j+"]="+a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		//향상된 for문을 이용한 배열요소의 출력
		int cnt1=0, cnt2=0;
		for(int[] i:a) {//int[] 변수:객체명
			for(int j:i ) {//int 변수:변수명
				System.out.print("a["+cnt1+"]["+cnt2+"]="+j+"\t");
				cnt2++;
			}
			cnt2=0;
			cnt1++;
			System.out.println();
		}
	}
}
