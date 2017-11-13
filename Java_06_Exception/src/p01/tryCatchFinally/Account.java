package p01.tryCatchFinally;

/* *
 * 소유주: String 타입의 필드 - owner
 * 계좌번호: String 타입의 필드 - accountNumber
 * 잔액 : long타입의 필드 - balance
 * */
public class Account {

	// 필드 (객체의 고유 속성, 현재의 상태를 저장하는 멤버변수)
	// 소유주
	// 계좌번호
	// 잔액
	String owner; //초기값 null
	String accountNumber; //초기값 null
	long balance; //초기값 0

	// 생성자 => Shift + Alt + s
	
	//생성자의 오버로딩
	//기본 생성자
	public Account() {}
	//매개변수가 1개인 생성자
	public Account(String owner) {
		this.owner = owner;
	}
	//매개변수가 2개인 생성자
	public Account(String owner, String accountNumber) {
		this.owner = owner;
		this.accountNumber = accountNumber;
	}
	//매개변수가 3개인 생성자
	public Account(String owner, String accountNumber, long balance) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	//메소드
	// Set && Get Method
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	
	//메소드
	public void deposit(int amount) {
		balance +=amount;
	}
	
	
	//예외 강제 발생
	//throw new EXception(); //Exception()생성자에 메세지 입력
	//new Exception(); //생성
	//throw 예외 위임 메소드

	public int withdrawal(int amount) throws Exception{
		if(balance < amount)
			throw new Exception("잔액이 모자랍니다.");
		else {
			balance -=amount;
		  }
			return amount;
	}
	
	
	
	
	
	
	
	
}
