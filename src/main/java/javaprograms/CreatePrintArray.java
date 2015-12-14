package javaprograms;
/**
 * 
 * @author satmuri
 *
 */
public class CreatePrintArray {

	public static void main(String[] args) {

		// Method 1

		Integer[] arr={1,2,3,4,5};
		System.out.println(" 1 Array inserted are:");

		for(int i=0;i<arr.length;i++)  // Used For-loop
		{
			System.out.println(arr[i]);
		}
	
		// Method 2	
	
		Integer[] arr2={6,7,8,9,10};
		System.out.println("2 Array inserted are:");

		for(Integer num:arr2)  	// Used Enhanced For-loop	

		{
			System.out.println(num);
		}
	}
		
	}


