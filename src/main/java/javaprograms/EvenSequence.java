package javaprograms;

/**
 * 
 * @author satmuri
 * create method
 * create loop for printing even numbers
 */

public class EvenSequence {
	
   public void printSeq(int start,int end)
   {    
	   if((start%2)==1)
	   {
		  start=start+1; 
	   }
	   
	   for (int i=start;i<=end;i=i+2)
	   {
		   System.out.print(" "+i);
	   }
   }
			
	
	public static void main(String[] args) {

		EvenSequence sequence=new EvenSequence();
		
		sequence.printSeq(2, 50);
		System.out.println();
		sequence.printSeq(22, 88);
		System.out.println();
		sequence.printSeq(1, 85);
		System.out.println();
		sequence.printSeq(-10, 99);


	}

}
