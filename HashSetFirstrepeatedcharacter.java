package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        String str = "a green apple";
        var arr = str.toCharArray();
        for (char ch : arr) {
            if (!set.contains(ch))
                set.add(ch);
            else {
                System.out.println(ch);
                return;
            }
        }
    }
}
