package javaprograms;

public class SumArray {
 
	public Integer sumOfArr(Integer[] arr) {
		
		Integer sumArr=0;

		for (int i = 0; i < arr.length; i++) 
		{
			sumArr = sumArr + arr[i];
		
		}
		
		return sumArr;

	}
	
	public static void main(String[] args) {

		 Integer[] arr={1,2,3,4,5};
		 System.out.println("Array inserted {}");
			for (int i = 0; i < arr.length; i++) // Used For-loop
			{
				System.out.print(" "+arr[i]);
			}
	                
			SumArray sumArray = new SumArray();
			System.out.println(sumArray.sumOfArr(arr));
			
			
			
	}

}
