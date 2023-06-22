package org.example;

public class ArrayQueue {
    int arr[];
    int front = 0;
    int rear = 0;
    int capacity;

    public ArrayQueue(int n) {
        capacity=n;
        arr = new int[n];
    }

    public void offer(int n) {

            if (isFull()) {
                System.out.println("Queue Full");
                return;
            }
            arr[rear] = n;
            rear++;
        }

    public int poll() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return -1;
        }
        int x = arr[front];
        front++;
        return x;
    }

    public boolean isEmpty() {
        if (front == rear)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (rear == capacity - 1)
            return true;
        else
            return false;
    }

    public int peek() {
        return arr[front];
    }
}


package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);
        queue.offer(10);
        queue.offer(20);
        //queue.offer(30);
        //queue.offer(40);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
    }
}
