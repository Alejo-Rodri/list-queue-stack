package com.training.data.structures;

import com.training.interfaces.INode;
import com.training.interfaces.ISinglyLinkedList;

public class SinglyLinkedListImpl<T> implements ISinglyLinkedList<T> {
    private INode<T> head;
    private INode<T> tail;
    private int size;

    public SinglyLinkedListImpl(T element) {
        head = new NodeImpl<>(element);
        tail = head;
        size = 1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size <= 0;
    }

    @Override
    public T first() {
        return head.getValue();
    }

    @Override
    public T last() {
        return tail.getValue();
    }

    @Override
    public void addFirst(T element) {
        var newest = new NodeImpl<>(element);
        newest.setNext(head);
        head = newest;
        size++;
    }

    @Override
    public void addLast(T element) {
        var newest = new NodeImpl<>(element);
        tail.setNext(newest);
        tail = newest;
        size++;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }
}
