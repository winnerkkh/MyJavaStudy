package p07.treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeExample2 {
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();

		treeMap.put("apple", new Integer(10));
		treeMap.put("forever", new Integer(60));
		treeMap.put("description", new Integer(40));
		treeMap.put("ever", new Integer(50));
		treeMap.put("zoo", new Integer(10));
		treeMap.put("base", new Integer(20));
		treeMap.put("guess", new Integer(70));
		treeMap.put("cherry", new Integer(30));

		System.out.println("[c~f] 사이의 단어 검색");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true); //전체에서 일부범위 추철
		
		for(Map.Entry<String, Integer> entry: rangeMap.entrySet()) {
			System.out.println(entry.getKey()+" - "+entry.getValue()+ " 페이지");
		}//for문 끝
	} //main 메소드 끝
}
