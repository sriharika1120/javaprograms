package javaprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString2 {

	public static void main(String[] args) {
        String input="";
        
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
            char[] try1= input.toCharArray();
            String reversed = "";
            for (int i=try1.length-1;i>=0;i--) {
            	
            	reversed = reversed + try1[i];
            }

            
        	System.out.print(reversed);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
	
	}
}


