package LeetCode_problems;
import java.util.*;
public class _268_Missing_Number {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String[] input = sc.nextLine().split(" ");

	        int n = input.length;

	        int expectedSum = n * (n + 1) / 2;

	        int actualSum = 0;

	        for(int i = 0; i < n; i++) {
	            actualSum += Integer.parseInt(input[i]);
	        }

	        System.out.println(expectedSum - actualSum);
	    }
	}