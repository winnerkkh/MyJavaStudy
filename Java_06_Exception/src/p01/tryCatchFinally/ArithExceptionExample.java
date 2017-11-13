package p01.tryCatchFinally;

public class ArithExceptionExample {
	public static void main(String[] args) {
		int num=100, result=0;
		
		for(int i=0; i<10; i++) {
							//0부터 9까지 나오게 하는 랜덤 메소드
			int ran = (int)((Math.random())*10); // 0*10<=Math.random()*10<1*10
                    						   // 0<=Math.random()*10<10(0~9)
			
/*			//예외 발생을 방지.
			if (ran==0) {
				System.out.println("0으로 나눌수 없습니다.");
			}
			else {
			result = num/ran;
			System.out.println("num= " + num);
			System.out.println("ran= " + ran);
			System.out.println("결과: "+result);
			}*/
			
			 try {//발생된 오류를 처리하는 문장
					result = num/ran;
					System.out.println("num= "+num);
					System.out.println("ran= "+ran);
					System.out.println("결과: "+result);
					}catch(ArithmeticException e) {
						System.out.println(e.getMessage());
						System.out.println(ran);
						System.out.println("오류발생");
					}
				}
			}
		}
