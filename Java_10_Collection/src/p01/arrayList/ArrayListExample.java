package p01.arrayList;

/* *
 * 배열 사용의 단점
 *  - 크기가 초기의 크기로 고정,자료추가가 어려움
 *  - 객체의 저장과 연산시 null여부확인
 * */

public class ArrayListExample {
	public static void main(String[] args) {
		//배열은 크기가 정해져있는 자료구조
		int [] arr1 = new int[5]; //크기가 5인 배열 => 그렇기 때문에 자료를 5개까지만 가능(인덱스 범위 초과시 오류 발생), int타입의 배열 기본값은 0
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
		arr1[3]=4;
		
//		arr1[4]="5"; //반드시 int타입의 테이타만 저장 가능 => "5"는 문자열이기에 저장이 안됨 	
//		arr1[5]=6; //ArrayIndexOutOfBoundsException
//		arr1[7]=6;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		
		//참조테이타 타입의 배열 
		String[] arr3 = new String[3];
		arr3[0]= "홍길동";
		arr3[1]= "일지매";
		//배열 요소의 초기값은 null이다.
		//요소값의 연산이 필요한 상황에서는
		//반드시 요소값이 null인지 여부를 확인해야한다.
		
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}
}
