package javaprograms;

public class StringEx {

	public static void main(String[] args) {

		//create a String
		
		String s="Harika";
		String s1="Satish";
		
		// combine two strings
		
		String str=s+s1;
		System.out.println(str);

	// print every character of a string 
		
        char[] charArr= str.toCharArray();
             
		 for (int i=0;i<charArr.length;i++)
		 {
		        System.out.println(charArr[i]);

        }
         

	}
}
