package LeetCode_problems;
import java.util.*;
public class _242_Valid_Anagram {
 
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String s = sc.nextLine();
	        String t = sc.nextLine();

	        if(s.length() != t.length()) {
	            System.out.println(false);
	            return;
	        }

	        char[] a = s.toCharArray();
	        char[] b = t.toCharArray();

	        Arrays.sort(a);
	        Arrays.sort(b);

	        System.out.println(Arrays.equals(a, b));
	    }
	}