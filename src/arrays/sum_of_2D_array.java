package arrays;

public class sum_of_2D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] arr = {{1,2},{3,4}};
		int sum = 0;
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j< arr[i].length; j ++) {
				sum = sum + arr[i][j];
			}
				
			}
		System.out.print(sum);
		}
		

	}


