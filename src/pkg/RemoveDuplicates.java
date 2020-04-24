package pkg;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("TestVal1 ");  
		set.add("TestVal2 ");  
		set.add("TestVal1 ");  
		set.add("TestVal2 ");  
		set.add("TestVal2 ");  
		set.add("TestVal3 "); 
		
		System.out.println("Duplicates Removed:");

		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			
			System.out.println(itr.next());  
		}  
	}

}




