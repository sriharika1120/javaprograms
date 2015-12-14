package javaprograms;

public class DeclareArray {

	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int[] arr={1,2,3,4,5};   // 1st method of declaring array
		
		int arr1[]={1,2,3,4,5};   // 2nd method of declaring array

		
		int[] arr2= new int[3];   // 3rd method of declaring array

		arr2[0]=1;
		arr2[1]=2;
		arr2[2]=3;

	for(int i=0;i<arr2.length;i++)
	{
		System.out.println("values of arr:"+arr2[i]);
		
	}
	
	
	}

}
