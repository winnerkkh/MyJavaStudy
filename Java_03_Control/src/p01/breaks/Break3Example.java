package p01.breaks;
/* *
 * break문을 만나면
 * break문 아래의 명령문은 실행하지 않고 반복블럭을 빠져나감.
 * */
public class Break3Example {
	public static void main(String[] args) {
		int i =0;
		int j =0;
		while(true) {//바깥쪽 while()시작
			i++;
			
			while(true) {
				System.out.print(j +"\t");
				if(j==5) 
					break; //break문을 만나면 아래의 j++명령을 실행하지 않고{}블럭을 빠져ㅑ나감.
					j++;
				
			}//안쪽 while문 끝
			System.out.println("i= "+i);
			if(i==10) {
				break;
			}
		}// 바깥쪽 while()문 끝
		System.out.println("종료");
	}
}
