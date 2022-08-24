package student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Tùng", 25);
        hashMap.put("Lộc", 19);
        hashMap.put("Hướng", 26);
        hashMap.put("Bình", 26);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Tùng", 25);
        treeMap.put("Lộc", 19);
        treeMap.put("Hướng", 26);
        treeMap.put("Bình", 26);
        System.out.println("Display entries in TreeMap");
        System.out.println(treeMap + "\n");

//        for(Map.Entry<String, Integer> entry: treeMap.entrySet()){
//            System.out.println(entry.getKey() + " " +entry.getValue());
//        }

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, false);
        linkedHashMap.put("Tùng", 25);
        linkedHashMap.put("Lộc", 19);
        linkedHashMap.put("Hướng", 26);
        linkedHashMap.put("Bình", 26);
        System.out.println(linkedHashMap +"\n");
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }





}
