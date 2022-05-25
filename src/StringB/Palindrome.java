package StringB;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the word : ");
		String word = sc.next(); 
		
		int start  = 0;
		int end  = word.length() -1;
		boolean ans = false;
		
		while(start <= end ) {
			if(word.charAt(start) == word.charAt(end)) {
				start++;
				end--;
				ans = true;
			}
			else {
				ans = false;
				break;
				
			}
		}
		
		if(!ans) System.out.println("This is not and palindrome");
		else System.out.println("Its a palindrome");
		

	}

}
