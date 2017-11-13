package test_171103;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BankApp {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static final String PREFIX = "Bank-";
	private static int seq=0;//계좌번호 자동발번
	private static boolean isCreated = false; //계좌등록여부 
	
	
	public static void main(String[] args) {
		boolean run =true;
		while(run) {
			System.out.println("              계좌생성 프로그램            ");
			System.out.println("-------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택>");
			int selectNo = scanner.nextInt();
			switch(selectNo) {
				case 1: createAccount(); break;
				case 2: accountList(); break;
				case 3: doposit(); break;
				case 4: withdraw(); break;
				case 5: run=false; break;
			}
		}	
			
	}
	
	
	
	private static void createAccount() {
		// bank-001, 홍길동, 100000
		
		System.out.println("예금주 성명을 입력해주세요");
		String owner = scanner.next(); //예금주 입력
		
		String accountNumber = PREFIX + String.format(new DecimalFormat("0000").format(++seq));
		System.out.println("Deposit 금액을 입력해주세요! ex)100000");
		int initialDeposit = scanner.nextInt();
			
			for(int i=0; i<accountArray.length; i++) {
				if(accountArray[i]==null) {
					accountArray[i]= new Account(owner, accountNumber, initialDeposit);
					System.out.println("계좌가 등록되었습니다");
					System.out.println();
					System.out.println("계좌의 정보는 다음과 같습니다.");
					System.out.printf("| 예금주 : %-5s | 계좌번호 : %-6s | 잔액 : %-10d\n", accountArray[i].getOwner(),
																					accountArray[i].getAno(),
																					accountArray[i].getBalance());
					isCreated=true; //isCreated변수는 static이라서 최종값을 가지고있음
					System.out.println("");
					break;
				}
			}
		
		
	}
	
	
	private static void accountList() {
		//항상 isRegistered()의 값은 True이여야함.
		//그래야 진행될수 있도록 설계
		
		if(!isRegistered()) { //if(!isCreated)
			System.out.println("등록된 계좌가 없습니다.");
			System.out.println("개설된 계좌를 개설하여 주세요!.");
			System.out.println();
			return;//return;-더이상 진행을 하지 않고 메소드 호출한곳으로 되돌아감.
		}
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				System.out.printf("| 예금주 : %-5s | 계좌번호 : %-6s | 잔액 : %-10d\n", accountArray[i].getOwner(),
																				accountArray[i].getAno(),
																				accountArray[i].getBalance());
			}
		}
		System.out.println();
	}
		
	//입금 메소드
	private static void doposit() {
		if(!isRegistered()){// if(!isCreated)			
			System.out.println("먼저 계좌등록을 하세요");
			System.out.println();
			return;//return;-더이상 진행을 하지 않고 메소드 호출한곳으로 되돌아감.
			}
		
		 //계좌번호 출력(확인용)
		 accountList();
		 System.out.println();
		 
		 //계좌번호 선택
		 System.out.println("원하시는 입금 계좌번호를 입력하여 주세요");
		
		 // 원하는 정보를 객체로부터 가져와야하기에, 임의에 로컬 변수(객체)를 선언
		 Account account;
		 
		 while(true) {
			 String accountNumber = scanner.next(); //계좌번호 입력
			 account = findAccount(accountNumber); //입력된 값으로 계좌배열에서 해당하는 계좌정보를 찾아서 리턴받음
			 //계좌정보가 잇으면 account객첼를 리턴,
			 //계좌정보가 없으면 null값을 리턴
				 if(account==null) {//해당하는 계좌가 없으면
					 System.out.println("계좌번호를 확인하세요>");
			 	}
				 
				 else {		 
					 break;//계속 입력받다가 계좌번호가 맞아서 계좌정보를 얻어오면
				 }
				 
		}//반복문을 빠져나감.
		 
		System.out.print("입금할 금액을 입력하세요>");
		int amount = scanner.nextInt();	 
		account.setDeposit(amount);//입금 처리
		System.out.println("예금 성공");
		System.out.println();
	}
		 
		 
		 
		 
	private static void withdraw() {
		if(!isRegistered()) {
			System.out.println("먼저 계좌등록을 하세요");
			return;//메소드 실행 종료.
		}	
		
		//계좌번호 출력
		 accountList();	
		 
		//계좌번호 출력(확인용)
		 accountList();
		 System.out.println();
		 
		 //계좌번호 선택
		 System.out.println("원하시는 출금 계좌번호를 입력하여 주세요");
		
		 //출금(잔액<출금액)	
		 //이거 왜 선언 해야함?
		 Account account;
		 while(true) {
			 String accountNumber = scanner.next(); //계좌번호 입력
			 account = findAccount(accountNumber); //입력된 값으로 계좌배열에서 해당하는 계좌정보를 찾아서 리턴받음
				 if(account==null) {//해당하는 계좌가 없으면
					 System.out.println("계좌번호를 확인하세요>");
			 	}
				 
				 else {		 
					 break;//계속 입력받다가 계좌번호가 맞아서 계좌정보를 얻어오면
				 }			 
		}//반복문을 빠져나감.
		 
		 //출금처리
		 System.out.print("출금할 금액을 입력하세요>");
		 int amount = scanner.nextInt();
		 int result;
		 try {
			 result = account.setWithdrawal(amount); //잔액 >출금액보다 큰 경우
			 System.out.println("출금액:"+result);
			 
		 }catch(Exception e) {//잔액 <출금액보다 작은경우
			 System.out.println(e.getMessage());
		  }
		 
	}//메소드 끝

	
	private static boolean isRegistered() {
		return isCreated; // 최종값을 리턴
						  //초기값은 false이고, 계좌를 등록하면 true
	}
	
	
	//입력된 계좌번호로 계좌정보 조회
	private static Account findAccount(String accountNumber) {

		//계좌정보를 담기위해, 임의에 로컬 변수 선언(원하는 찾을 값을 대입하기 위해)
		Account account=null;
		
		for(int i =0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) 
				if(accountArray[i].getAno().equals(accountNumber)) {
					//문자열의 내용비교: 문자열1.equals(문자열2)
					account = accountArray[i];
				}
		}
		return account;
	}
	
	
}
