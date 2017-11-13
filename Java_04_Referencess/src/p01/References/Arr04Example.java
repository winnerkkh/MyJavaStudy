package p01.References;

public class Arr04Example {
	public static void main(String[] args) {
		int[] a = {85,90,75,100,95}; //초기값으로 배열 객체 생성
		int sum = 0;
		double avg;
		for (int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		
		avg= sum/a.length; //합계//배열의 요소 갯수
		System.out.println("합계 "+sum);
		System.out.println("합계 "+avg);
		
		//향샹된 for문
		sum=0;
		int i = 0;
		for(int k:a) { //(타입 변수: 객체) 선언된 변수는 {여기서 사용}
			sum += k; //배열의 공간[]을 않써줘도, k만 써줘도 된다.(k가 하나하나 i의 값을 인식함)
		}
		
		avg = sum/a.length;
		System.out.println("합계 "+sum);
		System.out.println("합계 "+avg);
	}
}