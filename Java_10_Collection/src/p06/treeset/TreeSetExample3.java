package p06.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");

		System.out.println("[c~f] 사이의 단어 검색");
		NavigableSet<String> rangeSet;
		rangeSet = treeSet.subSet("c", true, "f", true); // TreeSet에 저장된 객체들 중 일부 추출
														 // (시작,true/false, 끝, true/false)
														 // true-범위 포함, false-범위 제외
		System.out.println(rangeSet);
		System.out.println();
		System.out.println();
		System.out.println();
		for(String word: rangeSet) {
			System.out.print(word +"\t");
		}

	}
}
