/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackbasedqueue;

import java.util.NoSuchElementException;

/**
 *
 * @author cobalt
 * @param <E>
 */
public class StackBasedQueue<E> {

    private MyStack<E> inStack;
    private MyStack<E> outStack;
    private int size = 0;
    private E front;
    private E rear;

    public void createQueue() {
        inStack = new MyStack<>();
        inStack.createStack();
        outStack = new MyStack<>();
        outStack.createStack();
    }

    public void enqueue(E item) {
        if (inStack == null || outStack == null) {
            System.out.println("Creating two stacks for queue implementation...");
            createQueue();
        }
        inStack.push(item);
        rear = item;
        size++;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("ERROR: Empty Queue");

        }
        populateOutStack();
        size--;
        return outStack.pop();
    }

    private void populateOutStack() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public E front() {
        if (isEmpty()) {
            throw new NoSuchElementException("ERROR: Empty Queue");

        } else if (size == 1) {
            front = rear;
        } else {
            populateOutStack();
            front = outStack.top();
        }
        return front;
    }

    public E rear() {
        if (isEmpty()) {
            throw new NoSuchElementException("ERROR: Empty Queue");

        }
        return rear;
    }

    public int size() {
        return size;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StackBasedQueue<String> q = new StackBasedQueue<>();

        q.createQueue();
        System.out.println("q.isEmpty() = " + q.isEmpty());

        q.enqueue("Milk");
        q.enqueue("Butter");
        q.enqueue("Eggs");
        q.enqueue("Cupcake");
        q.enqueue("Froyo");
        q.enqueue("Gingerbread");

        System.out.println("q.isEmpty() = " + q.isEmpty());
        System.out.println("q.size() = " + q.size());
        System.out.println("\nq.front = " + q.front());
        System.out.println("q.rear = " + q.rear() + "\n");

        System.out.println("q.dequeue() = " + q.dequeue());
        System.out.println("q.front = " + q.front());
        System.out.println("q.rear = " + q.rear() + "\n");

        q.enqueue("Pineapple");
        System.out.println("q.enqueue(\"Pineapple\");");
        System.out.println("q.front = " + q.front());
        System.out.println("q.rear = " + q.rear() + "\n");

        System.out.println("q.dequeue() = " + q.dequeue());
        System.out.println("q.front = " + q.front());
        System.out.println("q.rear = " + q.rear() + "\n");

        System.out.println("q.dequeue() = " + q.dequeue());
        System.out.println("q.front = " + q.front());
        System.out.println("q.rear = " + q.rear() + "\n");

        System.out.println("q.dequeue() = " + q.dequeue());
        System.out.println("q.front = " + q.front());
        System.out.println("q.rear = " + q.rear() + "\n");

        System.out.println("q.dequeue() = " + q.dequeue());
        System.out.println("q.front = " + q.front());
        System.out.println("q.rear = " + q.rear() + "\n");

        System.out.println("q.dequeue() = " + q.dequeue());
        System.out.println("q.front = " + q.front());
        System.out.println("q.rear = " + q.rear() + "\n");

        System.out.println("q.dequeue() = " + q.dequeue());
        System.out.println("q.isEmpty() = " + q.isEmpty());
        System.out.println("q.size() = " + q.size());

        // Exception in thread "main" java.util.NoSuchElementException: ERROR: Empty Queue
        // System.out.println("q.dequeue() = " + q.dequeue()); 
    }

}
