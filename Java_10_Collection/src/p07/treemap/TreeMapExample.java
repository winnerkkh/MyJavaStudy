package p07.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "일지매");
		scores.put(new Integer(75), "임꺽정");
		scores.put(new Integer(95), "이순신");
		scores.put(new Integer(80), "김길동");

		// Map에 저장된 요소의 정보 객체(K,V)를 받을수 있는 객체 Map.Entry
		Map.Entry<Integer, String> entry = null;

		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수: " + entry.getKey() + " - " + entry.getValue());

		entry = scores.lastEntry();
		System.out.println("가장 높은 점수: " + entry.getKey() + " - " + entry.getValue());

		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95점 아래 점수: " + entry.getKey() + " - " + entry.getValue());

		entry = scores.floorEntry(new Integer(95));
		System.out.println("95점이거나 바로 아래 점수: " + entry.getKey() + " - " + entry.getValue());

		entry = scores.ceilingEntry(new Integer(98));
		System.out.println("98점이거나 바로 우에 점수 : " + entry.getKey() + " - " + entry.getValue());

		while (!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(남은 객체 수:" + scores.size() + ")");
		}
	}
}
