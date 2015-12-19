package javaprograms;

public class RevArrSwap {

	 public int[] revArr(int[] arr)
	 
	 {

			for(int start=0,end=arr.length-1;start<arr.length/2;start++,end--)
			
			{
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				
			}
			return arr; 
		 
	 }
	
	public static void main(String[] args) {

		int arr[]={1,3,5,7,9};
		
		RevArrSwap revArray=new RevArrSwap();
			
		revArray.revArr(arr);
		
		System.out.println( "Reverese array ");
			
		for(int i=0;i<arr.length;i++)
			 {
			 System.out.println(arr[i]);
	         }
	
	}

}
