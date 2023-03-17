package Rikkei.academy;

import java.util.Arrays;

public class MyStack<E> {
    private E arr[];
    private int size;
    private int index = 0;


    public MyStack(int size) {
        this.size = size;
        arr = (E[]) new Object[size];
    }

    public void push(E element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    public E pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public E[] reverseStack() {
        E temp;
        for (int i = 0, j = index-1; i < index/2 ; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
