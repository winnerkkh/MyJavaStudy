package p01.synchronize;

public class Account {
	// 필드
	long balance;// 현재 잔액

	public void deposit(long amount) {
		balance += amount;
	}

	public void inquiry() {
		System.out.println("잔액:" + balance);
	}
}
