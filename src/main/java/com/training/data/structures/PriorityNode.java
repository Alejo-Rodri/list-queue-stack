package com.training.data.structures;

public class PriorityNode<T> {
    private final int key;
    private T value;
    private PriorityNode<T> next;

    public PriorityNode(int key, T value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public int getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public PriorityNode<T> getNext() {
        return next;
    }

    public void setNext(PriorityNode<T> next) {
        this.next = next;
    }
}
