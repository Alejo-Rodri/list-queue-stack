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

    public SinglyLinkedListImpl() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public T first() {
        if (isEmpty()) return null;
        return head.getValue();
    }

    @Override
    public T last() {
        if (isEmpty()) return null;
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
        if (isEmpty()) head = newest;
        else tail.setNext(newest);
        tail = newest;
        size++;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) return null;
        var first = head.getValue();
        head = head.getNext();

        if (head == null) tail = null;

        size--;
        return first;
    }

    @Override
    public boolean contains(T value) {
        INode<T> current = head;
        while (current != null) {
            if (current.getValue().equals(value)) return true;
            current = current.getNext();
        }
        return false;
    }
}
