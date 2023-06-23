package org.example;

import java.util.*;

public class PriorityQueue {
    int arr[];
    int count = 0;

    public PriorityQueue(int size) {
        arr = new int[size];
    }

    public void add(int ele) {
        int i;
        if (count == arr.length) {
            System.out.println("Queue Full");
            return;
        }
        for (i = count - 1; i >= 0; i--) {
            if (arr[i] > ele) {
                arr[i + 1] = arr[i];
            } else
                break;
        }
        arr[i + 1] = ele;
        count++;
    }

    public void remove() {
        if (isEmpty())
            System.out.println("Queue empty");
        else {
            count = count - 1;
            System.out.println(arr[count]);
        }
    }

    public boolean isEmpty() {
        if (count == 0)
            return true;
        else
            return false;
    }

    public String toString() {
        return Arrays.toString(arr);
    }

}


package org.example;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(5);
        queue.add(40);
        queue.add(10);
        queue.add(30);
        queue.add(50);
        queue.add(20);
        System.out.println(queue.toString());
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
    }
}
