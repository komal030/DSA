package org.example;

import java.util.Arrays;

public class ArrayQueue {
    int arr[];
    int front = 0;
    int rear = 0;
    int count=0;

    public ArrayQueue(int n) {
        arr = new int[n];
    }

    public void offer(int n) {

        if (isFull()) {
            System.out.println("Queue Full");
            return;
        }
        count++;
        arr[rear] = n;
        rear = (rear + 1) % arr.length;
    }

    public int poll() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return -1;
        }

        int x = arr[front];
        count--;
        front = (front + 1) % arr.length;
        return x;
    }

    public boolean isEmpty() {
        if (count==0)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (count==arr.length)
            return true;
        else
            return false;
    }

    public int peek() {
        return arr[front];
    }

    @Override
    public String toString() {
        return  Arrays.toString(arr);
    }
}


package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(Arrays.toString(queue.arr));
        queue.offer(60);
        queue.offer(70);
        queue.offer(80);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(Arrays.toString(queue.arr));
    }
}
