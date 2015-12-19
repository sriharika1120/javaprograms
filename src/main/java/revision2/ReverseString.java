package revision2;

 public class ReverseString {

	public String RevString(String str)
	{
		String reverseStr="";
		
		for(int i=(str.length()-1);i>=0;i--)
		{
			 reverseStr=reverseStr+str.charAt(i);
			
		}
		
		
		return reverseStr;
		
	}
	
	
	public static void main(String[] args) {

		String str="Harika";
		
		System.out.println("Input string is "+ str);
		
		ReverseString revString=new ReverseString();
		
		String reverseStr=revString.RevString(str);
		
		System.out.println("Output Reversed String "+ reverseStr);
			
		}
		
	}


