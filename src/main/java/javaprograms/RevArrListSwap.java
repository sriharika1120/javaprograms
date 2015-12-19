package javaprograms;

import java.util.ArrayList;

/**
 * @author satmuri
 *
 */
public class RevArrListSwap {

	public void reverse( ArrayList<String> list )
	
	{
	   for ( int start = 0, end = list.size() - 1 ;
	         start < list.size() / 2;
	         start++, end-- )
	   {
		   //swapping
		   String temp = list.get(start);
		   list.set(start, list.get(end));
		   list.set(end, temp);
	      
	   }
	}
 
	public static void main(String[] args) {
	
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		list.add("fff");
		
		
		RevArrListSwap  swapArrlist=new RevArrListSwap();
				
		 swapArrlist.reverse(list);
		 
		 System.out.println( "Reverese AL{} ");
		for(int i=0;i<list.size();i++)
		 {
		 System.out.println( list.get(i));
         }

}}