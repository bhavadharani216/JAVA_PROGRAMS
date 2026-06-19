package LeetCode_problems;
import java.util.*;
public class _169_Majority_Element {
	 
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String[] input = sc.nextLine().split(" ");

	        int candidate = 0;
	        int count = 0;

	        for(String s : input) {

	            int num = Integer.parseInt(s);

	            if(count == 0) {
	                candidate = num;
	            }

	            if(num == candidate) {
	                count++;
	            } else {
	                count--;
	            }
	        }

	        System.out.println(candidate);
	    }
	}