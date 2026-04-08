package com.harshit.HashMaps;
import java.util.*;
public class Main {
    static void main(String[] args) {
        String name = new String("Harshit");
        String name2 = "Harshit";
        System.out.println(name2.hashCode());
        int code = name.hashCode();
        System.out.println(code);
        Integer b = 30 ;
        System.out.println(b.hashCode());
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Harshit", 20);
        map.put("Dikshit", 50);
        map.put("Madan", 40);
        map.put("Madhav", 30);

        System.out.println(map.get("Madan"));
        System.out.println(map.keySet());
        System.out.println(map.remove("Harshit"));
        System.out.println(map.getOrDefault("Madan",100));  // used to return the default value if key is not present in the map

/// Custom HashMap
        MapusingHash map2 = new MapusingHash();
        map2.put("Litch", "Kunal's fav");
        map2.put("Pineapple", "Harshit's Fav");
        map2.put("Orange", "No one's Fav");

        System.out.println(map2.get("Orange"));


///  Custom map using Linkedlist and entity
        HashMapusingLinkedlist<String, String> map3 = new HashMapusingLinkedlist<>();
        map3.put("Harshit", "Harshit's Fav");
        map3.put("Pineapple", "Harshit's Fav");
        map3.put("Orange", "No one's Fav");
        System.out.println(map3.get("Orange"));
        System.out.println(map3);




    }
}
