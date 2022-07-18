package ss12_map.practice.testmap;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new java.util.TreeMap<>();

        treeMap.put("Smith", 30);
        treeMap.put("Anderson", 31);
        treeMap.put("Lewis", 29);
        treeMap.put("Cook", 29);
        System.out.println("Display entries in TreeMap");
        System.out.println(treeMap + "\n");
    }
}
