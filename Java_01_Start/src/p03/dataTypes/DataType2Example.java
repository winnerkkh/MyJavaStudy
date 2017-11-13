package p03.dataTypes;

public class DataType2Example {
	public static void main(String[] args) {
		int i = Integer.MAX_VALUE; //int의ㅣ 최고값
		int j = Integer.MAX_VALUE; // int의 최고값
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j); //int의 최고값이 넘었기에 Garbage Value가 출력됨.
		
		byte var1 = 127; 
		// byte타입은 최소값이 -128, 최대값이 127
		//-128부터 127까지 계속 반복됨.
		
		for(int k=1; k<=500; k++) {
			System.out.println(var1++);
		}
	}
}
