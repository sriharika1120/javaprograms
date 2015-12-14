package javaprograms;

	
	public class ReverseString1 {
	 
		public static void main(String[] args) {
	  
	  String input="AnoNuevoAve";
	  StringBuilder input1 = new StringBuilder();
	  
	  input1.append(input);
	  input1=input1.reverse();  
	  for (int i=0;i<input1.length();i++)
	 
		  System.out.print(input1.charAt(i));  
	 }
	 
	}

	

