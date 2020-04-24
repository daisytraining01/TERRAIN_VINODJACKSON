package pkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;



public class InputFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try{
			File file = new File("src/pkg/Text.txt"); 
			BufferedReader br = new BufferedReader(new FileReader(file)); 
			ArrayList<String> arr= new ArrayList<String>();

			String str; 
			int i=0;
			while ((str = br.readLine()) != null) {
				if(i%2==0) {
					arr.add(str);
					
				} 
				
				i++;
			}
			
			Iterator<String> iter = arr.iterator(); 
			 while (iter.hasNext()) { 
		            System.out.println(iter.next() + " "); 
		        } 	
		
		}
		catch(Exception e){
			System.out.println("File Not Found");
		}

	}

}
