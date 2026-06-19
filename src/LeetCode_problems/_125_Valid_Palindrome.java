package LeetCode_problems;
import java.util.*;
public class _125_Valid_Palindrome {
	 
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String s = sc.nextLine();

	        s = s.toLowerCase();
	        s = s.replaceAll("[^a-z0-9]", "");

	        int left = 0;
	        int right = s.length() - 1;

	        while(left < right) {

	            if(s.charAt(left) != s.charAt(right)) {
	                System.out.println(false);
	                return;
	            }

	            left++;
	            right--;
	        }

	        System.out.println(true);
	    }
	}