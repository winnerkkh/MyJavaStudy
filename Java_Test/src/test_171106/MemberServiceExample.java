package test_171106;

import java.util.Scanner;

public class MemberServiceExample {

	static Member[] memberArray = new Member[100];
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean isContinue = true;

		// 인사말
		System.out.println("Login Page 입니다");
		System.out.println();

		// id 입력
		System.out.println("회원님의 ID를 입력해 주세요");
		String id = scanner.next();

		// 패스워드 입력
		System.out.println("회원님의  패스워드를 입력해 주세요");
		String password = scanner.next();

		// 임시 변수에 findMember 메소드를 이용하여, 정보 유무 확인
		Member member = findMember(id, password);

		while (isContinue) {

			if (member == null) {
				System.out.println("회원님의 정보가 없습니다.");
				System.out.println("회원 가입을 원하십니까? (Y 또는 N)");
				// 가입을 원할경우
				char yesNo = scanner.next().charAt(0);
				if ((yesNo == 'y' || yesNo == 'Y')) {
					System.out.println();

					// 회원 이름 등록
					System.out.println("회원님의 성함을 입력해 주세요");
					String memberName = scanner.next();

					// 회원 ID 등록
					System.out.println("회원님의  원하시는 ID를 입력해 주세요");
					String wantedID = scanner.next();

					// 패스워드 등록
					System.out.println("회원님이 사용하실 패스워드를 입력해 주세요");
					String wantedPassword = scanner.next();

					for (int i = 0; i < memberArray.length; i++) {
						if (memberArray[i] == null) {
							memberArray[i] = member;
							memberArray[i] = new Member(wantedID, wantedPassword, memberName);
							System.out.println();
							System.out.println("회원님의 가입 정보는 다음과 같습니다.");
							System.out.println("성함: " + memberArray[i].getName());
							System.out.println("ID: " + memberArray[i].getId());
							System.out.println("패스워드: " + memberArray[i].getPassword());
							System.out.println();
							System.out.println("회원가입을 축하 드립니다!");
							isContinue = false;
							break;
						}
					}

				}

				else { // 가입을 원하지 않을 경우
					System.out.println();
					System.out.println("다음에 또 만나요~!");
					isContinue = false;
					break;
				}

			} // 바깥쪽 if문 종료

			// id와 password에 맞는 회원 존재
			else {
				System.out.println(member.getName() + "님 로그인 환영합니다.");
				isContinue = false;
			}

		} // 바깥쪽 while 반복문 종료
	}

	// 입력된 회원정보 아이디 찾기
	private static Member findMember(String id, String password) {

		// 멤버의 아이디를 찾기위해, 임의에 로컬 변수 선언(원하는 찾을 값을 대입하기 위해)
		Member member = null;

		for (int i = 0; i < memberArray.length; i++) {
			if (memberArray[i] != null)
				if (memberArray[i].getId().equals(id) && memberArray[i].getPassword().equals(password)) {
					// 문자열의 내용비교: 문자열1.equals(문자열2)
					member = memberArray[i];
				}
		}
		return member; // 입력값에 맞는 객체가 있으면 객체, 없으면 null값으로 리턴
	}
}

/*
 * * 또다른 방법
 * 
 * private static Member findMember(String id, String password){ Member member
 * =null;//초기값 null for(Member m:memberArray) { if(m!=null) {//배열의 요소중 null이
 * 아닌것만 연산 if(m.getId().equals(id) && m.getPassword().equals(password)) member =
 * m;//배열요소중 조건에 맞는 객체를 member에 대입 break;//반복문을 빠져 나감. } } return member;//입력값에
 * 맞는 객체가 있으면 객체,없으면 null값 }
 * 
 * 
 * 
 * 
 * private static Member findMember(String id, String password){ Member member
 * =null;//초기값 null for(Member m:memberArray) { if(m!=null) {//배열의 요소중 null이
 * 아닌것만 연산 if(m.getId().equals(id) && m.getPassword().equals(password)) member =
 * m;//배열요소중 조건에 맞는 객체를 member에 대입 break;//반복문을 빠져 나감. } } return member;//입력값에
 * 맞는 객체가 있으면 객체,없으면 null값 }
 * 
 */
