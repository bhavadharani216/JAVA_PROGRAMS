package LeetCode_problems;
import java.util.*;
public class _53_Maximum_Subarray {
	 
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String[] input = sc.nextLine().split(" ");

	        int sum = 0;
	        int max = Integer.MIN_VALUE;

	        for(int i = 0; i < input.length; i++) {

	            int num = Integer.parseInt(input[i]);

	            sum += num;

	            if(sum > max) {
	                max = sum;
	            }

	            if(sum < 0) {
	                sum = 0;
	            }
	        }

	        System.out.println(max);
	    }
	}

