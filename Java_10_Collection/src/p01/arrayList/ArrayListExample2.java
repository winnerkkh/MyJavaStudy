package p01.arrayList;

import java.util.ArrayList; //클래스
import java.util.List; //인터페이스

public class ArrayListExample2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // 클래스 구현체의 객체 생성 Promotion해서 대입

		// 자료추가
		list.add("Java"); // 뒤에 추가
		list.add("JDBC"); // 뒤에 추가
		list.add("Servlet/JSP"); // 뒤에 추가
		list.add(2, "DATABASE"); // index번지에 삽입(index 2번에 삽입)
		list.set(0, "HTML");
		list.add("iBatis"); // 뒤에 추가

		// 추가된 자료의 갯수확인
		int size = list.size();
		System.out.println("총 객체수: " + size);

		// 특정 index번지의 값을 출력 get(index)
		String skill = list.get(2);
		System.out.println("2: " + skill);

		// 전체 객체 출력
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
	}
}
