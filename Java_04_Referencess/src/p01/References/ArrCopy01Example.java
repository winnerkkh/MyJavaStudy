package p01.References;
/* *
 * 배열의 복사
 *  - 배열의 길이가 한번 선언되면 줄일수도, 늘릴수도 없다.
 *  - 그렇기 때문에, 복사가 안된값은 초기값인 0으로 계속 저장이 되어 있다.
 * */
public class ArrCopy01Example {
	public static void main(String[] args) {
		int[] a = {21,2,3,4,5,6,7}; //길이가 7인 1차원 배열
		int[] b = new int[10]; //길이가 10인 1차원 배열, 요소들의 값은  0으로 초기화
		int[] c = new int[10];
		int[] d = new int[10];
		int[] e = new int[10];
		
		// 배열의 요소들의 값 복사
		// a배열의 요소들을 b배열로 복사하면
		// 복사되지 않은 요소들은 초기값인 0으로 그대로 존재.
		// 배열의 각 요소들의 초기값은 기본데이타 타입은
		// 해당 타입의 기본값으로 초기;화 되고
		// 참조형 데이타타입은 null값으로 초기화 된다.
		for(int i=0; i<a.length; i++) {
			b[i]=a[i]; //a[i]의 값 이 b[i]번째에 값으로 복사 된다.
		}
		
		// 복사된 b배열 값을 확인
		for(int i=0; i<b.length; i++) {
			System.out.print("b["+i+"]=" +b[i] + "\t");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");
		
		//향상된 for문
		for(int i:b) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");
		// 배열의 복사 System.arraycopy()메소드
		// arraycopy(원본, 시작 Index, 복사할곳(Target), 타켓의 시작 Index, 복사할 길이)
		System.arraycopy(a, 0, c, 0, a.length);
		
		for(int j:c) {
			System.out.print(j + "\t");
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");
		
		//배열의 일부분 복사하기
		//arraycopy(원본배열, 시작 Index, 타켓배열타켓, 배열의 시작 Index, 복사할 길이)
		System.arraycopy(a, 0, c, 2, a.length);
		
		for(int k: c) {
			System.out.print(k + "\t");
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");
		
		
		//원본의 일부를 타켓배열의 첫번째 index부터 길이만큼 복사
		System.arraycopy(a, 1, d, 0, a.length-1);
		
		for(int k:d) {
			System.out.print(k + "\t");
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");
		
		//a배열의 일부를 타켓배열의 일부(시작 Index가3)에 복사하는 경우
		System.arraycopy(a, 1, e, 3, a.length-1);
		for(int k:e) {
			System.out.print(k + "\t");
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");	
		System.out.println("---------------------------------------------------------------------------");
		
		//for문을 사용하여 a배열의 1번째 index부터 끝까지의 내용을 
		//e배열의 index번호 3부터 시작하는
		
		for(int i=0; i<a.length; i++ ) {
			if(i>0) {
				e[i+3]=a[i];
			}
		}
		
		for(int k:e) {
			System.out.print(k + "\t");
		}
		
			
			
			
	} // main()메소드 끝
}
