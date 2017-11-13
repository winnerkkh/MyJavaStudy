package p02.clone;

import java.util.Comparator;

/* *
 * 일반객체를 비교할수 있도록 레핑(Wrapping) 해주는 객체생성
 * -Comparator<>인터페이스를 구현한 객체를 생성
 *  <>은 비교할 객체만 대입되도록 타입을 제한한 형 제한자.
 * */

public class StudentComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
	  if(o1.sno < o2.sno) return -1; //앞의 값이 적으면 -1(음수)
	  else if(o1.sno == o2.sno) return 0; //같으면 0
	  else return 1; //뒤의 값이 적으면 1(양수)
	}
}
