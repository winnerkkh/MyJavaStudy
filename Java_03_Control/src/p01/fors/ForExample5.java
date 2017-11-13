package p01.fors;
/* *
 * for문
 * 
 * */



public class ForExample5 {
	public static void main(String[] args) {
		// 1~20까지의 정수 중 2의 배수도 아니고 3의 배수도 아닌 수들의 합?
		int sum=0;
		for (int i=0; i<=20; i++) {
			if(i%2!=0 && i%3!=0) {}
			sum +=i;
		}
		System.out.println("전체수의 합은: " + sum);
		
		//두개의 주사위를 10번 던져서 두개의 합을 구하는 p/g
		//random()메소드를 이용한 난수 발생
		
		int dice1 = (int)(Math.random()*6+1);
		int dice2 = (int)(Math.random()*6+1);
		int totalNum = dice1+dice2;
		System.out.println("dice1= " + dice1);
		System.out.println("dice2= " + dice2);
		System.out.println("dice1 + dice2= " + (totalNum));
		
		//두수의 합이 6일때만 출력되도록 수정하세요
			if (totalNum==6) {
			System.out.println("두수의 합이 6인 경우: " + "dice1= " + dice1 + " dice2= " + dice2);
			System.out.println("총 합: " + totalNum);
			}
	
		
		
		
		
	}
}
