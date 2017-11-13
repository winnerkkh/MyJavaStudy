package p01.operations;
/**
 *  & |, && ||
 *  - or연산 
 *  - |: 왼쪽피연산자의 값이 true이더라도 오른쪽 피연산자의 값을 연산 후 |연산을 함.
 *  - || 왼쪽피연산자가 true이면 or연산의 특성상 오른쪽 피연산자의 
 *       true/false여부와 상관없이 true이므로 연산을 중단하고 다음명령을 실행함.
 *      OR연산
 *      T or T => T
 *      T or F => T   
 * */
public class AndOrOperExample1 {
	public static void main(String[] args) {
	 int num1 = 0,num2=0;
	 
	 if( ++num1>0 | ++num2>0)// 왼쪽1증가>0 :true,오른쪽1증가>0:true => or연산 
		 System.out.println("num1이 0보다 크거나 num2가 0보다 큽니다.");
	  System.out.println("num1="+num1);
	  System.out.println("num2="+num2);
	  num1=0;
	  num2=0; 
	  if( ++num1>0 || ++num2>0)//왼쪽1증가>0:true 바로 print()문이 실행
		  System.out.println("num1이 0보다 크거나  num2가 0보다 큽니다");
	  System.out.println("num1="+num1);
	  System.out.println("num2="+num2);
	  
	  // &, &&연산
	  //왼쪽의 피연산자 가 false이면 오른쪽피연산자의 결과와 상관없이 무조건 false
	  int num3=0,num4=0;
	  if(++num3<0 & ++num4<0)//양쪽 연산 후 결과값을 가지고 and 연산을 함.
		  System.out.println("num3가 0보다작고 num4가 0보다 작습니다.");
	  System.out.println("num3="+num3);
	  System.out.println("num4="+num4);
	  
	  num3=0;num4=0;
	  if(++num3<0 && ++num4<0)//&& 왼쪽이 false이므로 오른쪽 연산을 하지않고 
		                      //print()문을 실행
		  System.out.println("num3가 0보다작고 num4가 0보다 작습니다.");
	  System.out.println("num3="+num3);
	  System.out.println("num4="+num4); 
	}
}