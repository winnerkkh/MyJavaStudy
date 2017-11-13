package p01.fors;

/* *
 * for반복문(초기값; 체크; 증감)
 * */
public class ForExample4 {
	public static void main(String[] args) {
		
		//q1
		for (int i =0; i<=4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//q2
		System.out.println("------------");
		for(int i=4;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//q3
		System.out.println("--------------");
		for(int i=4;i>=0;i--) {
			for(int j=i;j>=0;j--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		
		//q4
		System.out.println("--------------");
       
		for(int i=0; i<5; i++) {
            for(int j= 5-i; j > 0;j--) {
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
	
		
		
		//5
		System.out.println("--------------");
		  for(int i=0;i<=5;i++) {
			   for(int j=0;j<=i;j++) {
			    System.out.print(" ");
			   }
			   for(int j=0;j<5-i;j++) {
			    System.out.print("*");
			   }
			   System.out.println();
			  }
	}
}


//outputs are as below
/*


*
**
***
****
*****
------------
*****
****
***
**
*
--------------
     *
    *
   *
  *
 *
--------------
     *
    **
   ***
  ****
 *****
--------------
 *****
  ****
   ***
    **
     *

*/

