//An integer ArrayList is given. Find the maximum gap between consecutive elements after sorting the list.

package arrayList;
import java.util.*;
public class q1 {

	public static void main(String[] args) {
		System.out.println("enter input");
		 Scanner sc = new Scanner(System.in);
	     ArrayList<Integer> a = new ArrayList<>();

	        while (sc.hasNextInt()) {
	            a.add(sc.nextInt());
	        }

	        if (a.size() < 2) {
	            System.out.println(0);
	            return;
	        }

	        Collections.sort(a);

	        int maxGap = 0;

	        for (int i = 1; i < a.size(); i++) {
	            maxGap = Math.max(maxGap, a.get(i) - a.get(i - 1));
	        }

	        System.out.println(maxGap);
	    }
	}