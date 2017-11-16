package p01.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample5 {
	public static void main(String[] args) {
		// 홍길동, 일지매,임꺽정,이순신 값을 입력받아서
		// 리스트만들고
		// 입력된 객체의 갯수만큼 반복해서
		// index번호 0번지의 값을 삭제하는 코드
		List<String> list;
		list = new ArrayList<>();

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		list.add("홍길동");
		list.add("일지매");
		list.add("임꺽정");
		list.add("이순신");
		// 배열 length고정, list는 size() 안에 저장된 요소의 갯수
		int size = list.size();
		for (int i = 0; i < size; i++)
			System.out.println(list.remove(0));

		System.out.println("요소의 갯수:" + list.size());

	}
}
