package com.training.data.structures;

import com.training.interfaces.INode;

public class NodeImpl<T> implements INode<T> {
    private T value;
    private INode<T> next;

    public NodeImpl(T value) {
        this.value = value;
        next = null;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public INode<T> getNext() {
        return next;
    }

    @Override
    public void setNext(INode<T> next) {
        this.next = next;
    }
}
