//     *
//    **
//   ***
//  ****
// *****
//******

package revision;

public class Seq2 {
	
	public void seq(int num){
		
		for(int i=1;i<=num;i++){
			
		// or 	for(int j=5;j>=i;j--) {

			for(int j=1;j<=num-i;j++){
					
				System.out.print(" ");
				}
			for(int k=1;k<=i;k++){
				System.out.print("*");

			}
			System.out.println();

		       }
			}
		public static void main(String[] args) {
	     
			Seq2 star=new Seq2();
		    star.seq(6);
			System.out.println();

		}

	}


