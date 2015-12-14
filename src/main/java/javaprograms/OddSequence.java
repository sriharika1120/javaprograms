package javaprograms;

public class OddSequence {

	public void printSequence(int start,int end)
	{
		   if((start%2)==0)
		   {
			   start=start+1;
		   }

		for(int i=start;i<=end;i=i+2)
			 
			System.out.print(" "+i);

	}
	
	public static void main(String[] args) {

		OddSequence sequence=new OddSequence();
		
		sequence.printSequence(3, 50);
		System.out.println();
		sequence.printSequence(3, 70);
		System.out.println();
		
	}

}
