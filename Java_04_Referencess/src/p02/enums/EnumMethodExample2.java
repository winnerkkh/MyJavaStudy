package p02.enums;

import java.util.Scanner;

public class EnumMethodExample2 {

	public static void main(String[] args) {
		
		Gender gender = null;
		System.out.println("남성인지 여성인지???");
		System.out.println("MALE 혹은 FEMALE 로만 대답해주세요");
		Scanner scanner = new Scanner(System.in);
		//남성이면 "남성 입니다."
		//여성이면 "여성 입니다."
		
		gender = Gender.valueOf(scanner.next());
		//열거형.valueOf(문자열) => 입력한 문자열을
		//열거상수로 변환하는 메소드
		
			if(gender == Gender.MALE) {
				System.out.println("남성 입니다.");
			}
			
			else {
				System.out.println("여성 입니다.");
			}
		
		
	}

}
