package javaprograms;

public class Sequence2 {


		public void printSeq(int n)
		{
		
			for (int i=1;i<=n;i=i+1)
			{		 
			 for(int j=n;j>n-i;j--)
			 {
				 System.out.print(" "+j);

			 }
				System.out.println();

			 }

			
			
		}
		public static void main(String[] args) {

			Sequence2 sequence=new Sequence2();
			sequence.printSeq(5);
			System.out.println();

		}

	}
