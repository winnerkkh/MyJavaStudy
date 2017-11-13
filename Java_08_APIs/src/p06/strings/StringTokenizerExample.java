package p06.strings;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/일지매/임꺽정/이순신";

		// 객체 생성시 구분자를 기준으로 문자를 잘라서 저장
		StringTokenizer st = 
							new StringTokenizer(text, "/");

		int count = st.countTokens(); // 토콘화된 문자열의 갯수를 리턴

		for (int i = 0; i < count; i++) {

			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		//hasMoreTokens() - 남은 토큰이 있는지 확인 메소드
		st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken(); // token추출메소드
			System.out.println(token);
		}

	}
}
