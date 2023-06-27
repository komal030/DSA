package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String str = "a good apple";
        var arr = str.toCharArray();
        for (var ch : arr) {
            if (map.containsKey(ch)) {
                var count = map.get(ch);
                map.put(ch, count + 1);
            } else
                map.put(ch, 1);
        }
        for (var ch : arr) {
            if (map.get(ch) == 1) {
                System.out.println(ch);
                return;
            }
        }
        System.out.println(Character.MIN_VALUE);
    }
}
