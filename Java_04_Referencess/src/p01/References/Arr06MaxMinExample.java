package p01.References;

public class Arr06MaxMinExample {
	public static void main(String[] args) {
	 int[] num = {76,45,34,89,100,50,90,92};
	 int sum=0;
	 int max=0;//max변수의 초기값은 배열보다 현저하게 작은값
	 int min=120;//min변수의 초기값은 배열의 요소들보다 현저하게 큰값을 저장
	 //int타입의 배열에서 최소값,최대값 구하는 간단한 방법
	 for(int i=0;i<num.length;i++) {
		 sum+=num[i];//합계
		 
		 if(num[i]>max) {
			 max= num[i];
		 }
		 if(num[i]<min) {
			 min= num[i];
		 }
	 }
	 System.out.println("sum:"+sum);
	 System.out.println("avg:"+sum/num.length);
	 System.out.println("최대:"+max);
	 System.out.println("최소:"+min);

	}

}
