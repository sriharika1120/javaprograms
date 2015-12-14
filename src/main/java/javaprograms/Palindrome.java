package javaprograms;


	public class Palindrome {

		
		public boolean isStringPalindrome(String str) {
			
			String reversed = "";
			
			for(int i=str.length()-1;i>=0;i--)
			{
				reversed =reversed+str.charAt(i);
				
			}
			
			 System.out.println	(reversed );	
			
			if( str.equals(reversed))
			return true;
			else 
			return false;
			
		}
	

		public static void main(String[] args) {
	    
	    Palindrome palindrome = new Palindrome();
	    
	    System.out.println(" Checking Palindrome for String MOM--- "+palindrome.isStringPalindrome("MOM"));
	    
	    System.out.println(" Checking Palindrome for String Satish--- "+palindrome.isStringPalindrome("Satish"));
	    
	    System.out.println(" Checking Palindrome for String CIVIC--- "+palindrome.isStringPalindrome("CIVIC"));
	    
	   }
    
}