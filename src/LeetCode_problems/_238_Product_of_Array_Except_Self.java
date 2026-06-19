package LeetCode_problems;
import java.util.*;
public class _238_Product_of_Array_Except_Self {
 	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String[] input = sc.nextLine().split(" ");

	        int n = input.length;
	        int[] nums = new int[n];

	        for(int i = 0; i < n; i++) {
	            nums[i] = Integer.parseInt(input[i]);
	        }

	        int[] answer = new int[n];

	        answer[0] = 1;

	        for(int i = 1; i < n; i++) {
	            answer[i] = answer[i - 1] * nums[i - 1];
	        }

	        int rightProduct = 1;

	        for(int i = n - 1; i >= 0; i--) {
	            answer[i] = answer[i] * rightProduct;
	            rightProduct = rightProduct * nums[i];
	        }

	        for(int num : answer) {
	            System.out.print(num + " ");
	        }
	    }
	}