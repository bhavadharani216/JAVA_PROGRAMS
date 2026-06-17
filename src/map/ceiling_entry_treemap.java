package map;
import java.util.*;
public class ceiling_entry_treemap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> maps = new TreeMap<>();

        maps.put(101, "bhava");
        maps.put(101, "bha");
        maps.put(102, "dharani");
        maps.put(10,  "aaa");
        maps.put(103, "suji");

        System.out.println(maps);

        System.out.println(maps.containsKey(1005));
        System.out.println(maps.containsValue("suji"));
        
		Map.Entry <Integer, String> e = maps.firstEntry();
        System.out.println(e.getKey()+" "+e.getValue());

	}

}
