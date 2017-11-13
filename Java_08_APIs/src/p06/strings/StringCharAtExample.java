package p06.strings;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1230123"; // 13자리 숫자중 마지막 13번째 숫자를 check digit
										// 앞 12자리의 값들이 산식에 의해 출력된 값이 13번째
										// 값과 같아야함.

		// 문자열내의 특정위치의 문자 하나를 추출하는 메소드가
		// charAt(index번호);

		char gender = ssn.charAt(ssn.indexOf("-") + 1);
		switch (gender) {

		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;

		case '2':
		case '4':
			System.out.println("여자 입니다.");
			break;

		} // switch끝

		String str1 = new String("홍길동"); // 문자열 객체 생성
		String str2 = "홍길동"; // 문자열 리터럴

		if (str1 == str2)
			System.out.println("같은 String 객체 참조");
		else
			System.out.println("다른 String 객체 참조");

		if (str1.equals(str2))
			System.out.println("같은 내용");

		else
			System.out.println("다른 내용");

		// indexOf()메소드 문자의 위치를 리턴,
		// 만약 찾는 문자 패턴이 없으면 -1을 리턴
		// if(문자열.indexOf("패턴")) -1 => 찾는 문자열이 없다.

		String subj = "자바 프로그래밍";
		int location = subj.indexOf("프로그래밍");

		if (subj.indexOf("자바") != -1)
			System.out.println("자바와 관련이 있는 책이군요");
		else
			System.out.println("자바와 관련이 없는 책이군요");

		int length = ssn.length(); // 문자열의 길이 리턴

		if (length == 14)
			System.out.println("주민번호 자리수가 맞습니다.");
		else
			System.out.println("주민번호 자리수가 맞지 않습니다.");

		String oldStr = "자바는 객체지향 언어 입니다. 자바는 풍부한 API를 지원 합니다.";
		String newStr = oldStr.replace("자바", "JAVA");

		System.out.println(oldStr);
		System.out.println(newStr);

		// 문자열 자르기
		ssn = "880815-1234567";

		// index의 범위 0<= 범위 <6
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);

		String secondNum = ssn.substring(7); // 7~끝까지
		System.out.println(secondNum);

		// 대소문자변경
		String sstr1 = "Java Programming";
		String sstr2 = "JAVA PROGRAMMING";

		System.out.println(sstr1.equals(sstr2));

		// "java programming"
		// toLowerCase() 모두 소문자로 변경
		// "java programming" 하나 만들어져 있기때문에
		// 새로 만들지 않고 위의 값을 참조함.
		String lowerstr1 = str1.toLowerCase();
		String lowerstr2 = str2.toLowerCase();
		System.out.println(lowerstr1.equals(lowerstr2));

		// equalsIgnoreCase()대소문자 구분 없이 내용 비교
		System.out.println(sstr1.equalsIgnoreCase(str2));

		// 문자열 공백제거 -trim();
		String tel1 = "   02";
		String tel2 = "123    ";
		String tel3 = "    1234";
		String tel = tel1.trim() + "-" + tel2.trim() + "-" + tel3.trim();

		System.out.println("tel= " + tel);

		// 기본 데이타 타입의 데이타를 문자열로 변경
		String val1 = String.valueOf(10);// int 10 ->숫자형 문자열 "10"
		String val2 = String.valueOf(10.5);// double형 10.5 -> "10.5"
		String val3 = String.valueOf(true);// boolean타입 true->"true"

		   System.out.println(val1+" "+val1.length());
		   System.out.println(val2+" "+val2.length());
		   System.out.println(val3+" "+val3.length());
	}
}
