package p01.operations;
/* * 
 * 증감 연산자
 * 증감 연산자는 피연산자의 왼쪽/오른쪽 위치에 따라 
 * 증가되는 순서가 달라짐.
 * ex) ++x인 경우: 먼저 1증가 후의 값이 연산이됨.
 *     x++인 경우: 이전값으로 연산후에 1만큼 증가됨.
 *     
 *   
 * */
public class Oper3Example {
	public static void main(String[] args) {
		int x=0, y=0; //초기값 x=0, y=0
		System.out.println(x++); //x값 = 0 and then value increased by 1 (the value of x is equals to 1 from now on)
		System.out.println(y++); //y값 = 0 and then value increased by 1 (the value of y is equals to 1 from now on)
		System.out.println((x++) + (y++)); //2 이전값인 x=1, y=1인 값으로 연산 후 x=2, y=2로 증가
		System.out.println((++x) + (++y)); //6, x=3, y=3으로 1씩 증가된 이후에 연산을 함. 3+3=6
		System.out.println(x-y); //0
		
		x=0; y=0;
		System.out.println(x=x+1);
		System.out.println(y=y+1);
		
		System.out.println(x+y);
		System.out.println(x=x+1);
		System.out.println(y=y+1);
		
		System.out.println((x=x+1) + (y=y+1)) ;
		
		int family= 150;
		System.out.println("홍길동네 집에는 가족이" + ++family +"명 산다");
	}
}
