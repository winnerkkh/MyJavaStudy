package p08.arrays;
import java.util.Arrays;
/* *
 * Sort -sort는 기본적으로 오름차순
 * binarySearch를 할때는 sort처리 후에 검색을 한다.
 * - 검색 효율을 높이기.
 * */
public class BinarySearchExample {
	public static void main(String[] args) {
		//기본데이타 타입
		int[] scores = {99,97,98};
	    Arrays.sort(scores);//기본데이타 타입은 오름차순으로 정렬
		//검색
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스:"+index);
		System.out.println("결과:"+scores[index]);
		
		for(int i=0;i<scores.length;i++)
			System.out.println("scores["+i+"]="+scores[i]);
		
		
		//String 타입
	    String[] names = {"홍길동","박동수","김민수"};
	    Arrays.sort(names);
	    index= Arrays.binarySearch(names, "홍길동");
	    
	    System.out.println("찾은 인덱스:"+index);
	    System.out.println("결과"+names[index]);
	    
	    
	    for(int i=0;i<names.length;i++)
	    	System.out.println("names["+i+"]="+names[i]);
	    //객체 타입(Member)
	    Member m1 = new Member("홍길동");//D64D AE38 B3D9
	    Member m2 = new Member("홍길이");//D64D AE38 C774
	    Member m3 = new Member("홍기리");//D64D AE30 B9AC
	    Member[] members = {m1,m2,m3};
	    Arrays.sort(members);
	    index= Arrays.binarySearch(members, m2);
	    System.out.println("찾은 인덱스:"+index);
	    System.out.println("결과:" + members[index].name);
	    
		for(int i=0;i<members.length;i++)
			System.out.println("memers["+i+"]="+members[i].name);
	}

}
