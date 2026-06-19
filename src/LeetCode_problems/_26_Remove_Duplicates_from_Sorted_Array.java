package LeetCode_problems;
import java.util.*;
public class _26_Remove_Duplicates_from_Sorted_Array {
	
  
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String[] input = sc.nextLine().split(" ");

	        int[] nums = new int[input.length];

	        for(int i = 0; i < input.length; i++) {
	            nums[i] = Integer.parseInt(input[i]);
	        }

	        int i = 0;

	        for(int j = 1; j < nums.length; j++) {

	            if(nums[j] != nums[i]) {
	                i++;
	                nums[i] = nums[j];
	            }
	        }

	        int k = i + 1;

	        System.out.println(k);

	        for(int x = 0; x < k; x++) {
	            System.out.print(nums[x] + " ");
	        }
	    }
	}


