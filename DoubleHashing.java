package org.example;

import java.util.Arrays;

public class DoubleHashing {
    int hashvalue;
    char arr[];

    public DoubleHashing(int n) {
        hashvalue = n;
        arr = new char[hashvalue];
    }

    public int hashfunction1(int a) {
        return a % hashvalue;
    }


    public int hashfunction2(int a, int p) {

        int d = p - (a % p);
        return d;

    }

    public int findprime() {

        for (int i = hashvalue - 1; i >= 2; i--) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count = 1;
                    break;
                }
                if (count == 0)
                    return i;
            }
        }
        return 2;
    }

    public void insert(int n, char ch) {
        int p = findprime();
        for (int i = 0; i < hashvalue; i++) {
            int index = hashfunction1(hashfunction1(n) + i * hashfunction2(n, p));
            if (arr[index] < 'a' || arr[index] > 'z') {
                arr[index] = ch;
                return;
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}



package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        DoubleHashing dh = new DoubleHashing(5);
        dh.insert(6, 'a');
        dh.insert(8, 'b');
        dh.insert(11, 'c');
        System.out.println(dh.toString());

    }
}
