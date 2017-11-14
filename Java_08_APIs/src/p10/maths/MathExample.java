package p10.maths;

public class MathExample {
	public static void main(String[] args) {
		int v1 = Math.abs(-5);// 절대값 - 방향성이 없고 크기만 있는 수
		double v2 = Math.abs(-3.14);
		System.out.println("v1=" + v1 + ",v2=" + v2);

		double v3 = Math.ceil(5.3);// 올림 - 5.3보다 큰 수 중에서 가장 작은 정수
		double v4 = Math.ceil(-5.3);
		System.out.println("v3=" + v3 + ",v4=" + v4);

		double v5 = Math.floor(5.3);// 버림 - 5.3보다 작은 수들 중에서 가장 큰 정수
		double v6 = Math.floor(-5.3);
		System.out.println("v5=" + v5 + ",v6=" + v6);

		int v7 = Math.max(5, 9);// 정수의 큰값
		double v8 = Math.max(5.3, 2.5);// 실수의 큰값
		System.out.println("v7=" + v7 + ",v8=" + v8);
		
		double v9 = Math.min(5, 9);//정수의 작은값
		double v10 = Math.min(5.3, 2.5);//실수의 작은값 
		System.out.println("v9="+v9+",v10="+v10);
		
		double v11 = Math.random();//0<=이고 <1 인 실수값
		//  0<= Math.random() <1
		//  0*10<=Math.random() <1*10
		//  0<= Math.random()*10 <10 (범위 : 0~9)
		//  0*10+1 <=(int)(Math.random()*10)+1< 10+1(범위 : 1~10)
		System.out.println("v11="+v11);
		
		double v12 = Math.rint(5.3);//5.3에서 가장 가까운 정수
		double v13 = Math.rint(5.7);//5.7에서 가장 가까운 정수
		System.out.println("v12="+v12+",v13="+v13);
		
		//반올림 소수점 둘째자리에서 반올림
		long v14 = Math.round(5.3);//반올림
		long v15 = Math.round(5.7);//반올림
		System.out.println("v14="+v14+",v15="+v15);
		
		double value = 12.3456; //=> 12.34로 나오게 할려면?
		//12.345에서 -> 12.345*100 -->round(1234.5) -> 1234/100 -> 12.35
		double temp1 = value*100;//1234.56
		long temp2 = Math.round(temp1); // round(1234.56) => 1235
		double v16 = temp2/100.0; //12.35
		System.out.println("v16= " + v16);
	}	

}
