package com.training.interfaces;

public interface IQueue<T> {
    void enqueue(T element);
    /*
        Removes and returns the first element from the queue.
     */
    T dequeue();
    /*
        Returns the first of the queue w/o removing it
     */
    T first();
    int size();
    boolean isEmpty();
}
