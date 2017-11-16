package p04.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LottoExample {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		// 6개의 값 중복없이 저장
		while (set.size() < 6) { //set.size가 맨처음에 0으로 시작됨 => set.size()는 가변적이여서 계속 변함.
			int ran = (int) (Math.random() * 45) + 1;// 0<=Math.random()*45<1*45+1
			set.add(ran);
		}

		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}

	}

}
