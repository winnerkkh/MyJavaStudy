package p01.classes;

public class Account {
	
	//속성(field)
	private String owner;
	private int balance;
	
	//동작(method)
	public String getOwner() { //소유주 리턴
		return owner;
	}
	
	public void setOwner(String owner) { //소유주 저장
		this.owner = owner;
	}
	
	public int getBalance() { //잔고 출력 메소드
		return balance;
	}
	
	public void setBalance(int balance) { //초기 입금 매소드
		this.balance = balance;
	}
	
    public void deposit(int amount) {
    	this.balance +=amount;
    }
	
    public int withdraw(int amount) {//출금 메소드
    	if(this.balance<amount) {
    		//return this.balance; 남아있는 잔고까지만 출금
    		return 0; //잔고는 그대로 보존
    	}	
    	
    	else {
	    	this.balance -=amount;
	    	return amount;
    	}
    }
	
}
