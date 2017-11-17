package p04.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* *
 * Set - 자료를 중복저장하지 않는 자료구조
 * 	   - 순서가 없음
 * */
public class HashSetExample {
	public static void main(String[] args) {
		
		//Set 객체 생성
		Set<String> set = new HashSet<>(); //HashSet객체 생성 후 Promotion
		set = Collections.synchronizedSet(set); //동기화
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //동일한 객체의 중복저정은 허용 안됨
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("총 객체의 갯수: " + size); //동일한 객체의 중복저정은 허용 안됨(비록 추가는 5개 이지만, 중복된 객체가 있기에, 4개로 객채의 갯수가 나옴)
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(new Integer(1)); //객체저장 Wrapper클래스
		set2.add(1); //int타입의 정수 -> Wrapper클래스: auto-boxing <---- 이건 저장 안함... 왜냐하면 위에서 Integer(1) 객체가 이미 선언되었기에, 중복을 허용안해서 저장안됨
		set2.add(2); //int타입의 정수 -> Wrapper클래스: auto-boxing
		set2.add(new Integer(3));  
		
		System.out.println("총 객체의 갯수: " + set2.size());
		
		//set에서 자료를 얻어내기위해서 반복자를 생성
		//iterator() - 저장객체들의 순서와 번지 정보를 만들어서 Iterator객체에 저장
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { //hasNext()자료가 있는 여부확인 메소드
			String el= iterator.next(); // next()값을 가져오는 메소드
			System.out.print("\t"+el);
		}
		
		//set2 정보 출력
		//set2에서 자료를 얻기위해서 반복자를 생성
		System.out.println();
		Iterator<Integer> iterator2 = set2.iterator();
		while(iterator2.hasNext()) {
			Integer el2 = iterator2.next();
			System.out.print("\t"+el2);
		}
	}
}
