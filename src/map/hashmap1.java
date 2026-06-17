package map;

import java.util.*;

public class hashmap1 {

    public static void main(String[] args) {

        HashMap<Integer, String> maps = new HashMap<>();

        maps.put(101, "bhava");
        maps.put(102, "dharani");
        maps.put(103, "suji");

        System.out.println(maps);

        System.out.println(maps.containsKey(1005));
        System.out.println(maps.containsValue("suji"));
    }
}