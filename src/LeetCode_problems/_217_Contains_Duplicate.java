package LeetCode_problems;
import java.util.*;
public class _217_Contains_Duplicate {
 
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String[] input = sc.nextLine().split(" ");

	        HashSet<Integer> set = new HashSet<>();
	        boolean duplicate = false;

	        for(int i = 0; i < input.length; i++) {

	            int num = Integer.parseInt(input[i]);

	            if(set.contains(num)) {
	                duplicate = true;
	                break;
	            }

	            set.add(num);
	        }

	        System.out.println(duplicate);
	 
	}
}
