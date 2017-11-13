package p03.systems;

public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		//이 시점의 시각을 나노초로 출력
		
		int sum=0;
		for (int i=1; i<=100000; i++) {
			sum+=i;
		}//합
		
		long time2 = System.nanoTime();
		//이 시점의 시각을 나노초로 출력
		
		System.out.println("1~100000까지의 합: " + sum);
		System.out.println("작업시간은 "+(time2-time1)+"나노초 소요");
		
		
	}
}
