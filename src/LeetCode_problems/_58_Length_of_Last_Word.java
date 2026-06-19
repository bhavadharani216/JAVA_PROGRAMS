package LeetCode_problems;
import java.util.*;

public class _58_Length_of_Last_Word {
	
	 
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String s = sc.nextLine().trim();

	        String[] words = s.split("\\s+");

	        System.out.println(words[words.length - 1].length());
	    }
	}