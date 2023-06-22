package org.example;

import java.util.Stack;

public class QueueWithTwoStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void enqueue(int ele) {
        stack1.push(ele);
    }

    void dequeue() {
        if (isEmpty())
            throw new IllegalStateException();
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
        System.out.println(stack2.pop());
    }

    public void peek() {
        if (isEmpty())
            throw new IllegalStateException();
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
        System.out.println(stack2.peek());
    }

    public boolean isEmpty() {
        if (stack1.isEmpty() && stack2.isEmpty())
            return true;
        else
            return false;
    }
}



package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        QueueWithTwoStack queue = new QueueWithTwoStack();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.peek();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
