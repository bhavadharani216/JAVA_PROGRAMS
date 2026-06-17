package arrayList;

import java.util.*;

public class q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input:");

        ArrayList<Integer> a = new ArrayList<>();

        while (sc.hasNextInt()) {
            a.add(sc.nextInt());
        }

        if (a.size() < 2) {
            System.out.println("No second largest element");
            return;
        }

        Collections.sort(a);

        int largest = a.get(a.size() - 1);
        int secondLargest = -1;

        for (int i = a.size() - 2; i >= 0; i--) {
            if (a.get(i) != largest) {
                secondLargest = a.get(i);
                break;
            }
        }

        if (secondLargest == -1)
            System.out.println("No second largest element");
        else
            System.out.println(secondLargest);
    }
}