package pkg;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        	String str = "RestAssured";
        	String s1= str.substring(0, 2);
        	String s2 =str.substring(4,11 ); 
        	System.out.println("output:"+s1+s2);
        	
        	//compare two Strings using compareto method
        	
        		
        	String string1 = new String("Hello"); 
            String string2 = new String("World"); 
            
            System.out.println("Comparing " + string1 + " and " + string2 
                    + " : " + string1.compareTo(string2));
            
        	// .equals method 
            String str1 = "Hello";
        	String str3	= "Hello";
        	if (str1.equalsIgnoreCase(str3)){
        		System.out.println("Both are equal");
        	}
        	else {
        		System.out.println("both are not equal");
        	}
	}

}
