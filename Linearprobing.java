package org.example;

import java.util.Arrays;

public class LinearProbing {
    int hashvalue;
    char arr[];

    public LinearProbing(int n) {
        hashvalue = n;
        arr = new char[hashvalue];
    }

    public int hashfunction(int a) {
        return a % hashvalue;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public void insert(int n, char ch) {
        for (int i = 0; i <= hashvalue; i++) {
            int h = hashfunction(n + i);
            if (arr[h] < 'a' || arr[h] > 'z') {
                arr[h] = ch;
                return;
            }
        }
    }
}


package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinearProbing lp = new LinearProbing(5);
        lp.insert(1, 'a');
        lp.insert(2, 'b');
        lp.insert(3, 'c');
        lp.insert(2, 'd');
        System.out.println(lp.toString());

    }
}

