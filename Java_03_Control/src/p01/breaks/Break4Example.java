package p01.breaks;
/* *
 * 이중 반복문을 빠져나가는 break문;
 * Lable: 을 선언후 break Lable;
 * */

public class Break4Example {
	public static void main(String[] args) {
		int i=0;
		int j=0;
	KK:	while(true) {
			i++;
			while(true) {
				System.out.println("j= " + j+"\t");
				if(j==5) break KK; //라벨인 KK로 선언된 반복문을 벗어남.
				j++;
			}
		//	 System.out.println("i= " + i);
		//	if(i==10) break;  //<===의미가 없음. 왜냐하면 위에 Label로 묵여있는 묶음때문에 break이후 바로 밖으로 빠져나오는것이 아니라, while문 통째로 나가게됨.
		}
		System.out.println("종료");
	}
}
