package p07.regularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternExample2 {
	public static void main(String[] args) {

		String regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String data = "angel@naver.co.kr"; // angel@naver.com

		boolean result = Pattern.matches(regExp, data);

		if (result) {
			System.out.println("기준에 부합합니다");
		}

		else {
			System.out.println("기준에 맞지 않습니다.");
		}

		regExp = "[ㄱ-ㅎ|ㅏ-ㅣ|가-휳]";
		data = "횽";

		if (result) {
			System.out.println("기준에 부합합니다");
		}

		else {
			System.out.println("기준에 맞지 않습니다.");
		}

		Scanner scanner = new Scanner(System.in);
		// 패스워드 앞에특수문자1, 알파벳 3 + 숫자2 => 패스워드 체크 표현식
		regExp = "[~!@#$%^&*][a-zA-Z]{3}\\d{2}";
		int cnt = 0;

		while (true) {
			if (cnt >= 5) {
				System.out.println("종료");
				System.exit(0);
			}
			System.out.println("비밀번호를 입력하세요");
			
			data = scanner.next();
			result = Pattern.matches(regExp, data);
			
			if (result) {
				System.out.println("로그인 성공");
				System.exit(0);
				
			} 
			
			else {
				System.out.println("로그인 실패");
				++cnt;
				System.out.println(cnt);
			}
		}
	}

}