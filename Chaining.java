package org.example;

import java.util.Arrays;

public class Chaining {
    int hashvalue;
    Node arr[];

    Chaining(int k) {
        hashvalue = k;
        arr = new Node[hashvalue];
    }

    public int hashfunction(int a) {
        return a % hashvalue;
    }

    void insert(int a, char b) {

        int h = hashfunction(a);
        Node N1 = new Node(a, b);

        if (arr[h] == null)
            arr[h] = N1;
        else {
            Node N2 = arr[h];
            while (N2.next != null)
                N2 = N2.next;
            N2.next = N1;
        }
    }

    public void display() {
        for (int i = 0; i < hashvalue; i++) {
            Node N1 = arr[i];
            if (N1 == null)
                System.out.println(N1);
            else {
                while (N1.next!= null) {
                    System.out.print("("+N1.key+" "+N1.val+")"+" -> ");
                    N1 = N1.next;
                }
                System.out.println("("+N1.key+" "+N1.val+")" );
            }
            System.out.println();
        }
    }

}



package org.example;

public class Node {
    int key;
    char val;
    Node next;
    public Node (int a,char b)
    {
        key=a;
        val=b;
        next=null;
    }
}



package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Chaining C=new Chaining(5);
        C.insert(1, 'a');
        //C.insert(2, 'b');
        C.insert(3, 'c');
        C.insert(4, 'd');
        C.insert(5, 'e');
        C.insert(6, 'f');
        //C.insert(7, 'g');
        C.insert(8, 'h');
        C.insert(9, 'i');
        C.insert(10, 'j');
        C.display();

    }
}
