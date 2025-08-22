package com.training.data.structures;

import com.training.interfaces.IStack;

public class StackImpl<T> implements IStack<T> {
    private final SinglyLinkedListImpl<T> list;

    public StackImpl(T element) {
        list = new SinglyLinkedListImpl<>();
        list.addFirst(element);
    }

    public StackImpl() {
        list = new SinglyLinkedListImpl<>();
    }

    @Override
    public void push(T element) {
        list.addFirst(element);
    }

    @Override
    public T pop() {
        return list.removeFirst();
    }

    @Override
    public T top() {
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
