package p01.tryCatchFinally;

public class AccountExample {

	public static void main(String[] args) /*throws Exception*/{

		// 객체생성

		Account account1 = new Account();
		account1.owner = "이순신";
		account1.accountNumber = "111-001";
		account1.balance = 100000;

		account1.setOwner("이순신");
		account1.setAccountNumber("111-001");
		account1.setBalance(100000);

		String owner = account1.getOwner();
		String accountNumber = account1.getAccountNumber();
		long balance = account1.getBalance();
		System.out.println("정보=> " + "소유자: " + owner + " 계좌번호: " + accountNumber + " 잔액: " + balance);

		Account account2 = new Account("홍길동");
		account2.accountNumber = "111-004";
		account2.balance = 100000;
		owner = account2.getOwner();
		accountNumber = account2.getAccountNumber();
		balance = account2.getBalance();
		System.out.println("정보=> " + "소유자: " + owner + " 계좌번호: " + accountNumber + " 잔액: " + balance);

		Account account3 = new Account("일지매", "111-002");
		account3.balance = 100000;
		owner = account3.getOwner();
		accountNumber = account3.getAccountNumber();
		balance = account3.getBalance();
		System.out.println("정보=> " + "소유자: " + owner + " 계좌번호: " + accountNumber + " 잔액: " + balance);

		Account account4 = new Account("임꺽정", "111-003", 100000);
		owner = account3.getOwner();
		accountNumber = account3.getAccountNumber();
		balance = account4.getBalance();
		System.out.println("정보=> " + "소유자: " + owner + " 계좌번호: " + accountNumber + " 잔액: " + balance);
		
		
		
		//입금처림
		account4.deposit(50000);
		long amt = account4.getBalance(); //필드의 연할(고유속상, 현재상태 저장)
		System.out.println("현재 잔액: " + amt);
		
		//출금처리
		//호출되는 메소드가 throws Exception{}으로 선언되어 있으며
		//호춣하는 곳에서 예외처리를 해줘야한다
		//try-catch(){} - 호출한쪽에서 예외를 처리하는 명령
		//throws Exception{} 처리하는 두가지 - 이 프로그램을 호출한 곳으로 예외를 위임하는 명령을 처리하는 두가지
		
		try {
			 account4.withdrawal(80000);
			 System.out.println(1);
			 account4.withdrawal(80000);
		     System.out.println(2);
		}catch(Exception e) {
			System.out.println(e.getMessage()); //getMessage()가 호출된 
			//호출된 메소드의 Exception()의 생성자 매개변수의 메세지를
			//받아서 출력
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
