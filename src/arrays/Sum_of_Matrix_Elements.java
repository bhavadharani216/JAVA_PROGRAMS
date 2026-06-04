package arrays;
import java.util.Scanner;

public class Sum_of_Matrix_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int cols = sc.nextInt();
		
		int [][] arr= new int [row][cols];
		int sum = 0;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols; i++) {
				arr[i][j] =sc.nextInt();
				sum = sum +arr[i][j];
			}
			
		}
		System.out.print(sum);
		
		
		

	}

}
