package p03.dataTypes;
/* *
 * 16진수표기 : 0x로 시작 
 * 8진수 표기:0을 시작
 * 
 * */



public class DataType4Example {
	public static void main(String[] args) {
		boolean varb = true;
		byte var_byte = 127; //-128~127
		short var_short = 32767; 
		char var_char1 = 66; //0~65535
		System.out.println(var_char1); //B
		char var_char2 = 'A';
		char var_char31 = '가'; //char타입에 값을 입력시 '가'입력
		char var_char32 = '\uac00'; /*u해당 unicode를 입력해도 동일한 결과나옴. */
		System.out.println("var_char31= " + var_char31);
		System.out.println("var_char32= " + var_char32);
		System.out.println("한글");
		System.out.println('\ud55c'); //2byte표기 => 1101 0101 0101 1100 => u는 무시
		System.out.println('\uae00'); //2byte표기 => 1010 1110 0000 0000 => 2진법 표기 => 1바이트 equals to 8 bit
		
	}
}
