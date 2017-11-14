package p07.regularExpression;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		// ()그룹핑, \뒤에 특수문자 -> \+ \d :숫자한개
		// {3,4} {n,m}최소3개 최대 4개
		// \d{4} 정화히 4개
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-1235-4567";
		boolean result = Pattern.matches(regExp, data);
		if (result)
			System.out.println("정규식과 일치합니다");
		else
			System.out.println("정규식과 일치하지 않습니다.");

		// 정규식을 사용하지 않을때
		String str1 = data.substring(0, data.indexOf("-") - 1);
		String str2 = data.substring(data.indexOf("-") + 1, data.lastIndexOf("-"));
		String str3 = data.substring(data.lastIndexOf("-") + 1);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		
		//정규식을 사용하지 않을때
		//substring(시작index, 끝index) => 시작 index <= 범위 <끝 index
		boolean result1=false , result2=false, result3=false;

		if (str1.length() >= 2 && str1.length() <= 3) {result1 = true;}
		if (str2.length() >= 3 && str1.length() <= 4) {result2 = true;}
		if (str3.length()== 4) {result3 = true;}
		
		if(result1==true && result2==true &&result3 ==true) {
			System.out.println("자리수가 맞습니다.");
		}
		else {
			System.out.println("자리수가 맞지 않습니다.");
		}
	}

}
