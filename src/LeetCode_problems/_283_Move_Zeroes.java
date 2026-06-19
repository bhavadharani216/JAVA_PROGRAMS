package LeetCode_problems;
import java.util.*;
public class _283_Move_Zeroes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input");

        String[] input = sc.nextLine().split(" ");
        int[] nums = new int[input.length];

        for(int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
		
		int j=0;
		for(int i= 0; i<nums.length;i++) {
			if(nums[i] != 0){
				nums[j]=nums[i];
				j++;
			}
		}
		while(j<nums.length) {
			nums[j]=0;
			j++;
		}
		
		for(int num:nums) {
			System.out.print(num +" ");

		}
		
	}

}
