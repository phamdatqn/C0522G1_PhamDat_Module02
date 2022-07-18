package ss12_map.practice.testmap;

import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new java.util.LinkedHashMap<>();

        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("Display entries in LinkedHashMap");
        System.out.println(linkedHashMap + "\n");
    }
}
