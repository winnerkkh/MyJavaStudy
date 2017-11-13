package p01.operations;
/* * 
 * 복합대입연산자
 * */
public class Oper8Example {
	public static void main(String[] args) {
		//로컬변수
		int result = 0;
		result +=10; // result =result+10 //기존 result값에 10을 더한 결과를 다시 result에 대입하여 연산
		System.out.println("result= "+result);
		
		result -=5; // result =result-5 //앞에 result값에 -5을 뺀 결과를 다시 result에 대입하여 연산
		System.out.println("result= "+result);
		
		result*=3;//result = result*3;//앞의 result값에 *3을 한 결과를 다시 result에 대입
		System.out.println("result= "+result);
		
		result/=5;//result = result / 5;//앞의 result값에 /5를 한 결과를 다시 result에 대입
		System.out.println("rsult= "+result);
		
		result%=3;//result = result % 3;//앞의 result값에 %3를 한 결과를 다시 result에 대입
		System.out.println("result= "+result);
}
	 
}
