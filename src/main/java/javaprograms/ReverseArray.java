package javaprograms;

public class ReverseArray {

	public Integer[] reverseArr(Integer[] arr) {

		Integer[] revArr=new Integer[arr.length];
				
		int arrCounter = 0;
		for (int i = (arr.length -1); i >= 0; i--) 
		{
			revArr[arrCounter] = arr[i];
			arrCounter++;
		}
		
	return revArr;
	}
	

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("Array inserted {}");
		for (int i = 0; i < arr.length; i++) // Used For-loop
		{
			System.out.print(" "+arr[i]);
		}

		ReverseArray reverseArray = new ReverseArray();
		System.out.println();
		System.out.println("Reversed Array {}");
		
		Integer[] revArr = reverseArray.reverseArr(arr);
		for (int i = 0; i < revArr.length; i++) // Used For-loop
		{
			System.out.print(" "+revArr[i]);
		}
		
		
	}

}
