package com.training.interfaces;

public interface IStack<T> {
    void push(T element);
    /*
        Removes and returns the top element from the stack
        null if empty
     */
    T pop();
    /*
        Returns without removing the top element
     */
    T top();
    int size();
    boolean isEmpty();
}
