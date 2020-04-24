package pkg;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String to check palindrome:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int length = str.length();
		String temp ="";
		for (int i = length-1;i>=0;i--) {
			temp=temp+str.charAt(i);
			
		}
if(str.equalsIgnoreCase(temp)) {
	System.out.println("Input string is a palindrome");
}
else {
	System.out.println("Input string is not  a palindrome");
}
		
	}

}
