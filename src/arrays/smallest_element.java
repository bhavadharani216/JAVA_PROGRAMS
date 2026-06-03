package arrays;

public class smallest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,3,6,9,3,0,21,55,6,50};
		int smallest = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
System.out.println(smallest);
	}

}
