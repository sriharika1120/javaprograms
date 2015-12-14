//******
//*****
//****
//***
//**
//*

package revision;

public class Seq3 {

		public void seq(int num){
		
		for(int i=0;i<=num;i++){
			
			for(int j=0;j<=num-i;j++){
					
				System.out.print("*");
				}
			System.out.println();

		       }
			}
		public static void main(String[] args) {
	     
			Seq3 star=new Seq3();
		    star.seq(5);
			System.out.println();

		}

	}

