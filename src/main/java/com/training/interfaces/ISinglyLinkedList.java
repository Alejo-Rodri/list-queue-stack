package com.training.interfaces;

public interface ISinglyLinkedList<T> {
    int size();
    boolean isEmpty();
    T first();
    T last();
    void addFirst(T element);
    void addLast(T element);
    /*
        Removes and returns the first element of the list.
     */
    T removeFirst();
    T removeLast();
}
