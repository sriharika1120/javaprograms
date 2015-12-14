package javaprograms;

public class MultiplyElementsArr {

	public Integer MulArr(Integer[] arr)
	
	{
		Integer mulArr=1; 
		for(int i=0;i<arr.length;i++)
		{
			mulArr=mulArr*arr[i];
			
		}
		
		return mulArr;
	
	}
	
	
	public static void main(String[] args) {

		Integer[] arr={1,2,3,4,5};
		System.out.println("Array to be multiplied:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);

		}
		
		MultiplyElementsArr multiplyArr=new MultiplyElementsArr();
		System.out.println("----");

		System.out.println(multiplyArr.MulArr(arr));
		
	}

}
