package revision;
//
//*
//**
//***
//****
//*****



public class Seq1 {

	public void seq(int num){
	
	for(int i=0;i<=num;i++){
		
		for(int j=0;j<=i;j++){
				
			System.out.print("*");
			}
		System.out.println();

	       }
		}
	public static void main(String[] args) {
     
		Seq1 star=new Seq1();
	    star.seq(5);
		System.out.println();

	}

}
