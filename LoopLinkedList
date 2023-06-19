package org.example;

public class Node {
    int val;
    Node next;

    public Node(int a) {
        val = a;
        next = null;
    }

    public void checkLoop(Node first) {
        Node t1 = first;
        Node t2 = first;
        int f = 0;
        while (t1 != null && t1.next != null && t2 != null) {
            t1 = t1.next.next;
            t2 = t2.next;
            if (t1 == t2) {
                f = 1;
                break;
            }
        }
        if (f == 1)
            System.out.println("Loop present");
        else
            System.out.println("No loop");
    }
}


package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Node N1=new Node(10);
        Node N2=new Node(20);
        Node N3=new Node(30);
        Node N4=new Node(40);
        N1.next = N2;
        N2.next = N3;
        N3.next = N4;
        N4.next = null;
        N1.checkLoop(N1);

    }
}
