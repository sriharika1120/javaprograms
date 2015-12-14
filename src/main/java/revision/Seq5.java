//     *
//    **
//   ***
//  ****
// *****


package revision;

public class Seq5 {

		public void seq(int num){
			
			for(int i=1;i<=num;i++){
				
				for(int j=0;j<=i;j++) {
					
				System.out.print(" ");}
				
			
				
				for(int k=1;k<=i;k++){
				
					System.out.print("* ");

			       }
				System.out.println();
			   }

				}
			public static void main(String[] args) {
		     
				Seq5 star=new Seq5();
			    star.seq(5);
				System.out.println();

			}

		}



