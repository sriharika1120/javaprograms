package revision2;

import java.util.ArrayList;

public class ReverseArrList {

	public ArrayList<String> revArrLst(ArrayList<String> arrList)
		
	{
		
		 ArrayList<String> revArLst = new ArrayList<String>();
		
		for(int i=arrList.size()-1;i>=0;i--)
		{
		     revArLst.add(arrList.get(i)) ;
		}
		
		return revArLst;
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		ArrayList<String> arrList=new ArrayList<String>();
		arrList.add("harika");
		arrList.add("satish");

	    
		ReverseArrList revArrList=new ReverseArrList();
		
		ArrayList<String>revArLst=revArrList.revArrLst(arrList);
		
		for(int i=0;i<revArLst.size();i++)
		{
			System.out.println(revArLst.get(i));
		}
		
	     }    

		
}	



