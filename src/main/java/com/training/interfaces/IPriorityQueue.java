package com.training.interfaces;

public interface IPriorityQueue<T> {
    void offer(Integer key, T element);
    // shows the element with max priority w/o removing it
    T peek();
    // removes and returns the element with max priority
    T poll();
    boolean isEmpty();
    int size();
}
