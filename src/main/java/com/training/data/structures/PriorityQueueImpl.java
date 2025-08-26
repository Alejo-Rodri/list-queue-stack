package com.training.data.structures;

import com.training.interfaces.IPriorityQueue;

import java.util.Objects;

public class PriorityQueueImpl<T> implements IPriorityQueue<T> {
    private PriorityNode<T> head;
    private PriorityNode<T> tail;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void offer(Integer key, T element) {
        PriorityNode<T> newNode = new PriorityNode<>(key, element);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }

        if (newNode.getKey() < head.getKey()) {
            newNode.setNext(head);
            head = newNode;
            size++;
            return;
        }

        PriorityNode<T> current = head;
        while (!Objects.isNull(current.getNext()) && newNode.getKey() >= current.getNext().getKey())
            current = current.getNext();

        newNode.setNext(current.getNext());
        current.setNext(newNode);

        if (newNode.getNext() == null) tail = newNode;

        size++;
    }

    @Override
    public T peek() {
        if (isEmpty()) return null;

        return head.getValue();
    }

    @Override
    public T poll() {
        if (isEmpty()) return null;

        PriorityNode<T> first = head;
        head = head.getNext();
        if (head == null) tail = null;

        size--;
        return first.getValue();
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
