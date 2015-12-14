package revision;

public class ReverseArrayElements {

	public int[] revArr(int[] arr)
	{
		int[] revArray= new int[arr.length];
		
	     for(int i=(arr.length-1);i>=0;i--)
	     {
	    	 revArray[(arr.length -1) - i] =arr[i];
	     }
		
		
		return revArray;
		
	}
	
	public static void main(String[] args) {

		int arr[]={1,2,6,7,8};
		System.out.println("Input Elements in Array ");

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		ReverseArrayElements revArr= new ReverseArrayElements();
		System.out.println("Output elemts in Array");
		int[] reverseArr = revArr.revArr(arr);
		
		for (int i=0;i<reverseArr.length;i++)
		{
			System.out.println(reverseArr[i]);
		}
		
	}

}
