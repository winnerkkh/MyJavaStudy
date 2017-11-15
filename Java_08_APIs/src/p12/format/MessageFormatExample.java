package p12.format;

import java.text.MessageFormat;

public class MessageFormatExample {
	public static void main(String[] args) {
		String id = "java";
		String name = "홍길동";
		String tel = "010-123-4567";

		// MessageFormat
		String text = "회원 ID: {0} \n회원 이름: {1} \n전화번호: {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);

		System.out.println("==========================================");

		// printf("%s %s %s ",id,name,tel);
		String result2 = MessageFormat.format("회원 ID: {0} \n회원 이름: {1} \n전화번호: {2}", id, name, tel);
		System.out.println(result2);

		System.out.println("==========================================");

		// insert into memeber values(id,name,tel);
		String sql = "insert into member values({0},{1},{2})";
		Object[][] arguments = {{"'java1'","'홍길동'","'010-123-4567'"},
								{"'java2'","'홍길이'","'010-124-4567'"},
								{"'java3'","'홍길삼'","'010-124-4567'"},
								{"'java4'","'홍길사'","'010-123-4568'"},
								{"'java5'","'홍길오'","'010-123-4569'"},
								{"'java6'","'홍길육'","'010-122-4567'"}
								};
	    for(int i=0;i<arguments.length;i++) {
	    	for(int j=0;j<arguments[i].length;j++) {
	    		String result3 = MessageFormat.format(sql, arguments[i]);
	    		System.out.println(result3);
	    	}
	    }

	}
}
