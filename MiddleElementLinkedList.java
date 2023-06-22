package org.example;

public class Node {
    int val;
    Node next;

    public Node(int a) {
        val = a;
        next = null;
    }

    public void middleElement(Node first) {
        Node t1 = first;
        Node t2 = first;
        int count = 1;
        while (t1 != null && t1.next != null) {

            t1 = t1.next.next;
            if (t1 == null)
                break;
            t2 = t2.next;
            count++;
        }
        if (count % 2 == 0)
            System.out.println(t2.val + " and " + t2.next.val);
        else
            System.out.println(t2.val);
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
       Node N5=new Node(50);
        N1.next = N2;
        N2.next = N3;
        N3.next = N4;
        N4.next = N5;
        N5.next=null;
        N1.middleElement(N1);

    }
}
