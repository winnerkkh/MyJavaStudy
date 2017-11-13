package test_171106;

//로그인 프로그램
//id확인 => 안맞을시 => "회원가입을 하시겟습니까?" => Y or N => 배열만들어서 
//password확인
//로그인 패스
//환영 메세지

public class Member {
	
	// 필드
	private String id;
	private String password;
	private String name;

	// 생성자
	public Member(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	// 메소드
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
