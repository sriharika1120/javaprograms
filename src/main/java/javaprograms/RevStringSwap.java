package javaprograms;

public class RevStringSwap {


	public String revString(String str)
	
	{
		
		char[] revChars = str.toCharArray();
		for(int start=0,end=revChars.length-1;start<str.length()/2;start++,end--)
		{
			char temp=revChars[start];

			revChars[start] = revChars[end];
			revChars[end] = temp;
		}
	  return new String(revChars);
	}
	
	
	
	
	public static void main(String[] args) {

		String str="Reverse";
		
		System.out.println("Given String is: " +str);

		
		RevStringSwap revStr=new RevStringSwap();
		
		
		
		System.out.println("Reversed String {} "+revStr.revString(str));
		
		
	}

}
