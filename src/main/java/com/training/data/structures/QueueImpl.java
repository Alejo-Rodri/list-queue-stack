package com.training.data.structures;

import com.training.interfaces.IQueue;

public class QueueImpl<T> implements IQueue<T> {
    private final SinglyLinkedListImpl<T> list;

    public QueueImpl(T element) {
        list = new SinglyLinkedListImpl<>();
        list.addLast(element);
    }

    public QueueImpl() {
        list = new SinglyLinkedListImpl<>();
    }

    @Override
    public void enqueue(T element) {
        list.addLast(element);
    }

    @Override
    public T dequeue() {
        return list.removeFirst();
    }

    @Override
    public T first() {
        return list.first();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
