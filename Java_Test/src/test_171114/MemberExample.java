package test_171114;

import java.util.Scanner;
/* *
 * 회원가입 
 *  id:5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다
 *  password:6~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.
 *  name:5자이하 한글
 * */
import java.util.regex.Pattern;

public class MemberExample {
	
	public static void main(String[] args) {
		boolean isContunueID =true;
		boolean isContunuePassword =true;
		boolean isContunuename =true;
		boolean result= true;
		Scanner scanner = new Scanner(System.in);
		
				System.out.println("회원가입 하시겠습니까?");
				System.out.println();
				String idRegularExp = "(^[a-z0-9] {5,20})";
				
			

			
				System.out.println("ID를 입력하여 주세요");
				System.out.println("5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다");
				
				String id = scanner.next();

				result = Pattern.matches(idRegularExp, id);

				if (result == true) {
					System.out.println("ID기준의 부합 합니다!");
				}
				
				else {

					while(isContunueID) {
						System.out.println("ID기준의 부합 하지 않습니다!");
						System.out.println("ID를 입력하여 주세요");
						String idRe = scanner.next();
						result = Pattern.matches(idRegularExp, idRe);

						if(result==true) {
							System.out.println("ID기준의 부합 합니다!");
							id = idRe;
							isContunueID = false;
							break;
						}
					}	
				}
				
				

				idRegularExp = "[ㄱ-ㅎ|ㅏ-ㅣ|가-휳]";
				System.out.print("Password를 입력하여 주세요");
				System.out.println("Password 6~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.");
				String password = scanner.next();
				result = Pattern.matches(idRegularExp, password);
				
				
				if (result == true) {
					System.out.println("Password기준의 부합 합니다!");
				}
				
				else {	
					while(isContunuePassword) {
						System.out.println("Password기준의 부합 하지 않습니다!");
						System.out.println("Password 6~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.");
						System.out.println("Password를 입력하여 주세요");
						String passRe = scanner.next();
						result = Pattern.matches(idRegularExp, passRe);
					
						if(result==true) {
							System.out.println("Password기준의 부합 합니다!");
							password=passRe;
							isContunuePassword = false;
							break;
						}
						
					}	
				}
		
	
				idRegularExp = "([ㄱ-ㅎ|ㅏ-ㅣ|가-휳] {1,4})";
				System.out.print("이름을 입력하여 주세요");
				System.out.println("이름은 한글로 5자이하로만 입력해 주세요.");
				String name = scanner.next();
				result = Pattern.matches(idRegularExp, name);
				
				
				if (result == true) {
					System.out.println("이름 입력 기준의 부합 합니다!");
				}
				
				else {
					
					while(isContunuename) {
						System.out.println("이름 입력 기준의 부합 하지 않습니다!");
						System.out.println("이름을 입력하여 주세요");
						System.out.println("이름은 한글로 5자이하로만 입력해 주세요.");
						String nameRe = scanner.next();
						result = Pattern.matches(idRegularExp, nameRe);
						
						if(result==true) {
							System.out.println("이름 입력 기준의 부합 합니다!");
							name=nameRe;
							isContunuename = false;
							break;
						}
					}	
				}
					
	
			Member member = new Member(id, password, name);
			
			
			
			System.out.println("가입완료");
			
			System.out.println(member.toString());
		}

	}

