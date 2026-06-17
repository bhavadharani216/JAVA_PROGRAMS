// order maintain, 

package map;

import java.util.*;

public class linkedhashmap {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> maps = new LinkedHashMap<>();

        maps.put(101, "bhava");
        maps.put(101, "bha");
        maps.put(102, "dharani");
        maps.put(10,  "aaa");
        maps.put(103, "suji");

        System.out.println(maps);

        System.out.println(maps.containsKey(1005));
        System.out.println(maps.containsValue("suji"));
    }
}