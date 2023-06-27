package org.example;

import java.util.Arrays;

public class QuadraticProbing {
    int hashvalue;
    char arr[];

    public QuadraticProbing(int n) {
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

        int f = 0, i = 0, h = 0;
        while (f == 0 && h >= 0) {
            int d = (int) Math.pow(i, 2);
            int sum = n + d;
            h = hashfunction(sum);
            if (h >= 0 && (arr[h] < 'a' || arr[h] > 'z')) {
                arr[h] = ch;
                f = 1;
            }
            i = i + 1;
        }
        if (f == 0)
            System.out.println("Cannot insert");
    }
}





package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        QuadraticProbing qp = new QuadraticProbing(5);
        qp.insert(1, 'a');
        qp.insert(2, 'b');
        qp.insert(3, 'c');
        qp.insert(2, 'd');
        System.out.println(qp.toString());

    }
}

