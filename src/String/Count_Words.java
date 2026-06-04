package String;

import java.util.Scanner;

public class Count_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type word");

        String str = sc.nextLine().trim();

        String[] words = str.split("\\s+");

        System.out.println("Word Count = " + words.length);

        sc.close();
    }
}