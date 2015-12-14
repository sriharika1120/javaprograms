package javaprograms;

public class SumOfArray {
   
	public int sum (int[] arr )
	
	{
		  int sum=0;
		  
		  sum=arr[0]+arr[1];
		  return sum;
		  
	}
 
	
	
	public static void main(String[] args) {

		int[] arr=new int[2];
		
		arr[0]=20;  
		arr[1]=10;
		
		SumOfArray sum1=new SumOfArray();
		System.out.println(sum1.sum(arr));
	}

}
  