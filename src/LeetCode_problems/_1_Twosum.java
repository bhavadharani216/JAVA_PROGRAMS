package LeetCode_problems;
import java.util.*;
public class _1_Twosum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input");
		String [] input = sc.nextLine().split(" ");
		int arr [] =new int [input.length];
		
		for(int i=0;i<input.length;i++) {
			arr[i]=Integer.parseInt(input[i]);
		}
		
		int target=sc.nextInt();
		HashMap <Integer, Integer>  map  = new HashMap <>();
		for(int i=0;i<arr.length;i++) {
			int complement = target - arr[i];
			
			if(map.containsKey(complement)) {
				System.out.println(map.get(complement)+ " " +i);
				return;
			}
			map.put(arr[i], i);
		}
		
		

	}

}
