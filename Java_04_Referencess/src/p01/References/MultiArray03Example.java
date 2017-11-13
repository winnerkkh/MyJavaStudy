package p01.References;
/* *
 * 가변길이의 이차원배열
 * - 이차원 각행의 얼을 구성하는 요소의 길이가 서로 다른 배열
 * - 배열의 값을 구하기 위해서는 각 행의 열을 개별적으로 구해서 처리
 * */
public class MultiArray03Example {
	public static void main(String[] args) {
		 int[][] a = new int[3][];//
		 a[0] = new int[3]; //길이가 3인 1차원 배열
		 a[1] = new int[2]; //길이가 2인 1차원 배열
		 a[2] = new int[4]; //길이가 4인 1차원 배열
		 
		 a[0][0]=7; a[0][1]=7; a[0][2]=13;
		 a[1][0]=23; a[1][1]=3; a[1][2]=13;
		 a[2][0]=7; a[2][1]=21; a[2][2]=56; a[2][3]=71;
		 
	 
		 for(int i=0; i<a.length; i++) {
			 for(int j=0; j<a[i].length; i++) {
				 System.out.println(a[i][j]+"\t");
			 } //안쪽 for문()끝
			 System.out.println();
		 }//바깥쪽 for()문 끝.
	}
}
