package javaprograms;

/*
 * series
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * .
 * ..
 * n
 */

public class Sequence1 {

	public void printSeq(int n)
	{
	
		for (int i=1;i<=n;i=i+1)
		{		 
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print(" "+j);

		 }
			System.out.println();

		 }

		
		
	}
	public static void main(String[] args) {

		Sequence1 sequence=new Sequence1();
		sequence.printSeq(5);
		System.out.println();

	}

}
