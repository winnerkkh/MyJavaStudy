package p01.References;
/* *
 * 배열
 * */
public class Arr02Example {
	public static void main(String[] args) {
		int[] a = {23,45,67,789,2};//초기값으로 배열 생성할수 있음
		for(int i=0;i<a.length;i++)//length필드를 이용하여 배열의 길이를 구함
			System.out.println("a["+i+"]="+a[i]);//배열의 요소의 값 출력
		//향상된 for문(자바1.5부터 지원)
		for(int k:a) {// for(객체타입 변수:객체변수명){변수}
			System.out.println("k="+k);
		}
		
		System.out.println("----------------------------");
		/*int[] b;//선언 후
		 b = {23,45,67,789,2};*///참조변수에 객체를 대입 오류발생
		int[] c;
		c= new int[] {23,45,67,789,2};//new키워드로 객체를 생성하면서 초기값으로 요소들을 입력
		// String s ; s = new String(초기값);
		for(int i=0;i<c.length;i++) {
			System.out.println("c["+i+"]="+c[i]);
		}
		int i=0;
		for(int j:c) {//선언된 변수 j 반복자
			System.out.println("c["+i+"]"+j);
			i++;
		}	
	}
}