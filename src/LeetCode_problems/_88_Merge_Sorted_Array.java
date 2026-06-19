package LeetCode_problems;
import java.util.*;
public class _88_Merge_Sorted_Array {

	 
 
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int size1 = sc.nextInt();
	        int[] nums1 = new int[size1];

	        for(int i = 0; i < size1; i++) {
	            nums1[i] = sc.nextInt();
	        }

	        int size2 = sc.nextInt();
	        int[] nums2 = new int[size2];

	        for(int i = 0; i < size2; i++) {
	            nums2[i] = sc.nextInt();
	        }

	        int[] result = new int[size1];

	        int k = 0;

	        for(int i = 0; i < size1; i++) {
	            if(nums1[i] != 0) {
	                result[k++] = nums1[i];
	            }
	        }

	        for(int i = 0; i < size2; i++) {
	            result[k++] = nums2[i];
	        }

	        Arrays.sort(result);

	        for(int num : result) {
	            System.out.print(num + " ");
	        }
	    }
	}


