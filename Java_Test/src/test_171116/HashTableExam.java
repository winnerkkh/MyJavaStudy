package test_171116;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

/* *
 * Thread-safe: 멀티쓰레드환경에서 자료를 보호할수있는 구조
 * */
public class HashTableExam {

	// static선언 => HashTable 생성자를 기반으로 map객체 생성
	static Map<String, String> map = new Hashtable<>();

	// static선언 => 유저에게 입력값을 받기 위한 scanner객체 생성
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// 1.회원가입 2.로그인 3. 종료
		// 1.회원가입 - scanner로 입력받아서 저장
		// 반복 저장 종료.
		// 2.로그인시 패스워드가 5회 실패면 프로그램 종료
		// 아이디가 없으면 가입

		//
		boolean run = true;
		while (run) {
			try {
				System.out.println("-----------------------");
				System.out.println("1.회원가입|2.로그인|3.종료 ");
				System.out.println("-----------------------");
				System.out.print("선택>");

				int selectNo = scanner.nextInt();

				switch (selectNo) {

				case 1:
					// registration 메소드 실행
					registration();
					break;

				case 2:
					logIn();
					break;

				case 3:
					System.out.println("종료");
					run = false;

				default:

				}
			} catch (Exception e) {
				System.out.println("번호를 잘못 선택하셨습니다");
				System.out.println("다시 입력 주세요!");
			}
		} // while문 종료

	}

	private static void registration() {
		boolean run1 = true;
		boolean result = true;
		boolean isContinueID = true;
		boolean isContinueID2 = true;
		boolean isContunuePassword = true;
		boolean isContunuePassword2 = true;
		String id;
		String password;
		// 아이디 생성 조건
		String regularExp = "^[a-zA-Z0-9_-]{5,20}";

		while (run1) {
			System.out.println("ID를 입력하여 주세요");
			System.out.println("5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다");
			id = scanner.next();

			result = Pattern.matches(regularExp, id);

			while (isContinueID) {

				// map객체를 이용하여 id의 중복여부 확인
				if (map.containsKey(id)) {
					System.out.println("ID가 이미 존재 합니다.");

					// 아이디 재입력 요청 코드
					while (isContinueID2) {
						System.out.println();
						System.out.println("새로운 ID를 입력하여 주세요");
						System.out.println("5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다");
						String idRe = scanner.next();
						id = idRe;
						result = Pattern.matches(regularExp, id);

						if (map.containsKey(id)) {
							System.out.println("ID가 이미 존재 합니다.");
						}

						else if (result == false) {
							// 아이디 조건의 충족하지 못할경우
							System.out.println();
							System.out.println("ID기준의 맞지 않습니다!");
							System.out.println();
							System.out.println("ID를 입력하여 주세요");
							String idRe2 = scanner.next();
							id = idRe2;
							result = Pattern.matches(regularExp, id);
						}

						else {
							System.out.println();
							System.out.println("ID가 생성되었습니다.");
							isContinueID = false;
							isContinueID2 = false;
							break;
						}
					}

				}

				// 아이디 요구조건의 부합하지 않을 경우
				else if (result == false) {
					while (isContinueID) {
						System.out.println();
						System.out.println("ID기준의 맞지 않습니다!");
						System.out.println();
						System.out.println("ID를 입력하여 주세요");
						String idRe = scanner.next();
						id = idRe;
						result = Pattern.matches(regularExp, id);

						if (result == true) {
							System.out.println();
							System.out.println("ID가 생성되었습니다.");
							id = idRe;
							break;
						}
					}
				}

				while (isContunuePassword) {
					regularExp = "^[a-zA-Z0-9~!@#$%^&*]{6,16}";
					System.out.println();
					System.out.println("Password를 입력하여 주세요");
					System.out.println("Password 6~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.");
					password = scanner.next();
					result = Pattern.matches(regularExp, password);

					if (result == true) {
						System.out.println();
						System.out.println("Password 조건이 맞습니다!");
						System.out.println("회원가입이 되었습니다!");
						map.put(id, password);
						isContunuePassword = false;
						isContinueID = false;
						run1 = false;
						break;
					}

					else {
						while (isContunuePassword2) {
							System.out.println();
							System.out.println("Password 조건이 맞지 않습니다!");
							System.out.println();
							System.out.println("Password 6~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.");
							System.out.println("Password를 입력하여 주세요");
							String passRe = scanner.next();
							result = Pattern.matches(regularExp, passRe);

							if (result == true) {
								System.out.println();
								System.out.println("Password 조건이 맞습니다!");
								System.out.println("회원가입이 되었습니다!");
								password = passRe;

								map.put(id, password);

								isContunuePassword2 = false;
								isContunuePassword = false;
								isContinueID = false;
								run1 = false;
								break;
							}

						}
					}
				}

			}

		}

	}

	private static void logIn() {

		boolean run = false;
		System.out.println("ID를 입력하세요");
		String id = scanner.next();

		if (map.containsKey(id)) {// <키,값>저장된 자료에서 키부분만 검색
			int counter = 0;
			while (run) {
				System.out.println("Password를 입력해 주세요!");
				String password = scanner.next();

				if (map.get(id).equals(password)) {
					System.out.println("로그인 완료");

					// 정상 강제 종료
					System.exit(0);

				} else {// password가 불일치
					System.out.println("비밀번호가 일치하지않아요\n" + ++counter + "회 오류 --* ");
					if (counter == 5) {
						System.out.println("5이상 LogIn에 실패 하셧습니다");
						System.out.print("종료 합니다");
						System.exit(0);// 프로그램 종료
					}
				}
			} // while끝
		} else
			System.out.println("입력한 아이디가 존재하지않습니다.");
		System.out.println("회원가입하시겠습니까?(y/n)");

		if (isConfirm())
			registration();// 호출한 isConfirm()값이 true면 회원가입 메소드 출력
	}


	// 계속 진행 여부 확인 메소드
	private static boolean isConfirm() {
		char c = scanner.next().charAt(0);
		if (c == 'y' || c == 'Y')
			return true;
		else
			return false;
	}
}