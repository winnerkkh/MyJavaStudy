package p01.continues;
/* *
 * Continue문;
 * */
public class Continue3Example {
	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
		int num1 = (int)(Math.random() *6+1);// 0*6+1<=범위 *6+1
		int num2 = (int)(Math.random() *6+1);// 0*6+1<=범위 *6+1
		
	    if(num1+num2==6) continue;//continue문의 아래명령은 실행하지않음
	    
	    System.out.println(i+"회 num1="+num1+", num2="+num2);
		 }
	}
}
