package p12.format;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = 1234567.89;

		DecimalFormat df = new DecimalFormat("0");// 정수만 출력
		System.out.println(df.format(num));

		df = new DecimalFormat("0.0");// 소수자리 1자리 표시
		System.out.println(df.format(num));

		// 전체 자리에서 값을 제외한 빈자리를 0으로 채움
		df = new DecimalFormat("00000000000.00000");//
		System.out.println(df.format(num));

		df = new DecimalFormat("#");// 빈자리 공백
		System.out.println(df.format(num));
		df = new DecimalFormat("#.#");// 소수자리 1자리 표시
		System.out.println(df.format(num));
		df = new DecimalFormat("##########.#####");//
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0");//소수자리 1자리 표시
		System.out.println(df.format(num));
		df = new DecimalFormat("+#.0");//소수자리 1자리 표시
		System.out.println(df.format(num));
		df = new DecimalFormat("-#.0");//소수자리 1자리 표시
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0E0");//부동소수점 표시
		System.out.println(df.format(num));
		
		//양수 /음수 표시
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.# %");//%표시
		System.out.println(df.format(num));
		
		//원화 표시
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
		
		

	}

}
