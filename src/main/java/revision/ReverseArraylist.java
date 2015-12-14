package revision;

import java.util.ArrayList;

public class ReverseArraylist {

	 public ArrayList<String> reverseArLst(ArrayList<String> arLst){
		
		 ArrayList<String> revArLst = new ArrayList<String>();
		 
		 for(int i =(arLst.size()-1);i>=0;i--)
		 {
			 
			 revArLst.add(arLst.get(i)) ;
		 }		 
		 return revArLst;	 
	 }
	
	
	
	
	
	public static void main(String[] args) {

		ArrayList<String> arLst= new ArrayList<String>();
	    arLst.add("satish");
	    arLst.add("Durga");

	    ReverseArraylist revAlist=new ReverseArraylist();
	    
	    ArrayList<String> reverseArList=revAlist.reverseArLst(arLst);
	    
	    for(int i=0;i<reverseArList.size();i++)
	    {
	    	System.out.println(reverseArList.get(i));
	    }
	
	}

}
