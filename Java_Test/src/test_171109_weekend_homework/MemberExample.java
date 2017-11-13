package test_171109_weekend_homework;

import java.util.Scanner;

import test_171106.Member;

public class MemberExample {
	
	//Static으로 선언 - 여러 옵션에서 사용해야하기때문에
	static Member[] member = new Member[10];
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	//Do~while문 실행 조건
	boolean isContinue = true;
	
	do {
		System.out.println("-----------------------");
		System.out.println("1.회원가입|2.로그인|3.종료|");
		System.out.println("-----------------------");
		
		//옵션 선택 메시지
		System.out.println("\n원하시는 옵션을 선택하여 주세요!");
		
		int option = scanner.nextInt();
		
		switch(option) {
		
		//회원가입
		case 1: 
			
			break;
		
		//로그인	
		case 2:
			
			// 인사말
			System.out.println("Login Page 입니다");
			System.out.println();
			
			//아이디 입력
			System.out.println("회원님의 ID를 입력해주세요");
			String id = scanner.next();
			
			//패스워드 입력
			System.out.println("회원님의 패스워드를 입력해 주세요");
			String password = scanner.next();
			
			// 임시 변수에 findMember 메소드를 이용하여, 정보 유무 확인
			Member member = findMember(id, password);
			
			break;
			
		//종료	
		case 3:
			isContinue = false;
			break;
			
			
		default:
			System.out.println("잘못  입력 하셧습니다.");
		
		}	
	}while(isContinue);
		
		

	}

	
	// 입력된 회원정보 아이디 찾기
	private static Member findMember(String id, String password) {

		// 멤버의 아이디를 찾기위해, 임의에 로컬 변수 선언(원하는 찾을 값을 대입하기 위해)
		Member member = null;

		for (int i = 0; i < member.length; i++) {
			if (member[i] != null)
				if (member[i].getId().equals(id) && memberArray[i].getPassword().equals(password)) {
					// 문자열의 내용비교: 문자열1.equals(문자열2)
					member = member[i];
				}
		}
		return member; // 입력값에 맞는 객체가 있으면 객체, 없으면 null값으로 리턴
	}
	
}

/* *
 * 회원가입,
 * 로그인 처리
 * id체크 id가 다르면 NoMemerException();
 * 회원가입 처리
 * password다르면 NoMatchPassword();
 * 패스워드 5회 입력 까지 성공 못하면 자동 종료 System.exit(0);
 * 둘다 맞으면 로그인성공 메세지 출력
 * */