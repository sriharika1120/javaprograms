package javaprograms;

import java.util.ArrayList;
/**
 * Made some changes
 * ...... Some changes done by some other people
 * @author Sriharika
 */
public class Arraylist1 {

	public static void main(String args[]) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Satish");
		al.add("Harika");

		//  for loop..

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// enhanced for loop..
		
		for (String element : al) {
			System.out.println(element);
		}

	}

}
