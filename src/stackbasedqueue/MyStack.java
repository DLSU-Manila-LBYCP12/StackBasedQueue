/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackbasedqueue;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 *
 * @author cobalt
 */
public class MyStack<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    private int size;

    public void createStack() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void push(E item) {
        if (elements == null) {
            System.out.println("Creating the array container...");
            createStack();
        }
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = item;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length + (elements.length >> 1);
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("ERROR: Empty Stack");

        }
        E item = (E) elements[--size];
        elements[size] = null;
        return item;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public E top() {
        if (isEmpty()) {
            throw new NoSuchElementException("ERROR: Empty Stack");

        }
        return (E) elements[size - 1];
    }

    public int size() {
        return size;
    }

}
