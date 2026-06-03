package arrays;

public class largest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,3,6,9,3,21,55,6,50};
		int largest = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
System.out.println(largest);
	}

}
