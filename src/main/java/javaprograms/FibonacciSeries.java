package javaprograms;

public class FibonacciSeries {

	   public void printSeq(int num)
	   {
		   int firstNum=0;
		   int secondNum=1;
		   
		   System.out.print(" "+firstNum);
		   System.out.print(" "+secondNum);
		   
		   for(int i=0;i<num-2;i++)
		   {
			   int sum = firstNum+secondNum;
			   
			   System.out.print(" "+sum);
			   firstNum = secondNum;
			   secondNum = sum;
			   
		   }
	   }

	public static void main(String[] args) {

		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		
		fibonacciSeries.printSeq(5);
	}

}
