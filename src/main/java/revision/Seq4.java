// *****
//  ****
//   ***
//    **
//     *


package revision;

public class Seq4 {

	public void seq(int num){
		
		for(int i=num;i>=1;i--){
			
			for(int j=5;j>=i;j--) {
				
			System.out.print(" ");}
			
		
			
			for(int k=1;k<=i;k++){
			
				System.out.print("*");

		       }
			System.out.println();
		   }

			}
		public static void main(String[] args) {
	     
			Seq4 star=new Seq4();
		    star.seq(5);
			System.out.println();

		}

	}


