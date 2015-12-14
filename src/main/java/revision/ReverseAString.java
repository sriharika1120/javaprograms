package revision;

public class ReverseAString {

	public String revString(String str)
	{
        String rev= "";

		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		return rev;
		
	}
	
	
	public static void main(String[] args) {

		String str="Harika";
		
		System.out.println("Given String is:"+str);
	
		ReverseAString reverseStr = new ReverseAString();
		
		String rev = reverseStr.revString(str);

		System.out.println("Reversed String is:"+rev);
		
		
		
	
	}

}
