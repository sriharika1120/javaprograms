package javaprograms;

import java.util.ArrayList;

public class ReverseArrayList {

	public ArrayList<String> revAl(ArrayList<String> al)
	
	{
		ArrayList<String> alrev=new ArrayList<String>();
		
		for(int i=al.size()-1;i>=0;i--)
		{
			alrev.add(al.get(i));
			
		}
		
		return alrev;
		
	}
	
	
	public static void main(String[] args) {

		ArrayList<String> al= new ArrayList<String>();
		al.add("Harika");
		al.add("Satish");
		al.add("Munni");
		al.add("Phani");
		al.add("Choti");
	
		ReverseArrayList revArrList= new ReverseArrayList();
		
		ArrayList<String> alrev=revArrList.revAl(al);
	
		for(int i=0;i<alrev.size();i++)
		{
			System.out.println(alrev.get(i));
		}
		
	}

}
