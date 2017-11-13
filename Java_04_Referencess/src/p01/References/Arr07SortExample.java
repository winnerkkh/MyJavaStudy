package p01.References;

public class Arr07SortExample {
	public static void main(String[] args) {
		int[] num= {76,45,34,89,100,50,90,92};
		
		int temp=0;
		
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i]>num[j]) { //i번째의 값이 i+1번째 값보다 크면 서로 교체
					temp =num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.print("{");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + ",");
		}
		System.out.println("}");
	System.out.println("-----------------------------------");
	
	
	//내림차순 
	for(int i=0; i<num.length; i++) {
		for(int j=i+1; j<num.length; j++) {
			if(num[i]<num[j]) { //i번째의 값이 i+1번째 값보다 크면 서로 교체
				temp =num[i];
				num[i] = num[j];
				num[j] = temp;
			}
		}
	}
	System.out.print("{");
	for(int i=0; i<num.length; i++) {
		System.out.print(num[i] + ",");
	}
	System.out.println("}");
	
	}
}
