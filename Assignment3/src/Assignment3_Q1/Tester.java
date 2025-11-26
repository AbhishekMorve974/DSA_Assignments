package Assignment3_Q1;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
	            
	            Method 1: Reverse the string/number and compare

				public static boolean isPalindrome(String s) {
				    String rev = "";
				    for(int i = s.length()-1; i >= 0; i--) {
				        rev += s.charAt(i);
				    }
				    return s.equals(rev);
				}
				time: O(n)
				space: S(n)
		 */
		
		
		/*
 B) Method 2: Two–Pointer (without extra space)

		public static boolean isPalindrome(String s) {
		    int i = 0, j = s.length() - 1;
		    while(i < j) {
		        if(s.charAt(i) != s.charAt(j)) return false;
		        i++; j--;
		    }
		    return true;
		}


         Time: O(n)	
          Space: O(1)	
		 */
		
		/*
		 C) Method 3: Recursion
				
				public static boolean isPalindrome(String s, int i, int j) {
				    if(i >= j) return true;
				    if(s.charAt(i) != s.charAt(j)) return false;
				    return isPalindrome(s, i+1, j-1);
				}
				
         Time: O(n)	
          Space: O(1)
		 */
		
			
		
	}

}

