package org.example;


public class Node {
    int value;
    Node next;
}


import java.util.NoSuchElementException;
import java.util.*;
public class LinkedList {
    Node first;
    Node last;

    public void addLast(int val) {
        Node temp = new Node();
        temp.value = val;
        if (isEmpty()) {
            first = temp;
            last = temp;
        } else {
            last.next = temp;
            last = temp;
        }
    }

    public void addFirst(int val) {
        Node temp = new Node();
        temp.value = val;
        if (isEmpty())
            first = last = temp;
        else {
            temp.next = first;
            first = temp;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int val) {
        int i = 0;
        Node cur = first;
        while (cur != null) {
            if (cur.value == val)
                return i;
            else i++;
        }
        return -1;
    }

    public boolean contains(int val) {
        int j = indexOf(val);
        if (val == -1)
            return false;
        else
            return true;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
            return;
        }
        //Node second=first.next;
        //first.next=null;
        first = first.next;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (last == first) {
            first = last = null;
            return;
        }
        Node prev = first;
        Node cur = first.next;
        while (cur.next != null) {
            prev = prev.next;
            cur = cur.next;
        }
        prev.next = null;
        last = prev;
        last.next = null;
    }

    public int size() {
        int count = 0;
        Node temp = first;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public int[] toArray() {
        int arr[] = new int[size()];
        Node cur = first;
        int i = 0;
        while (cur != null) {
            arr[i++] = cur.value;
            cur = cur.next;
        }
        return arr;
    }

    public void reverse() {
        Node prev = first;
        Node cur = first.next;
        while (cur != null) {
            Node nex = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nex;
        }
        last = first;
        last.next = null;
        first = prev;
    }

    public int knodesapart(int k)
    {
        Node a=first;
        Node b=first;
        for(int i=0;i<k-1;i++)
        {
            b=b.next;
        }
        while(b.next!=null)
        {
            b=b.next;
            a=a.next;
        }
        return a.value;
    }
}



import org.example.LinkedList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        //System.out.println(list.indexOf(30));
        //System.out.println(list.indexOf(234));
        //System.out.println(list.indexOf(234));
        //System.out.println(list.contains(20));
        //list.removeFirst();
        //list.removeLast();
        //list.reverse();
        System.out.println(list.size());
        var arr = list.toArray();
        System.out.println(list.knodesapart(3));
        System.out.println(Arrays.toString(arr));
    }
}

