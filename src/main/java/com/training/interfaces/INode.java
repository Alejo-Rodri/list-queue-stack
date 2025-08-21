package com.training.interfaces;

public interface INode<T> {
    T getValue();
    void setValue(T value);
    INode<T> getNext();
    void setNext(INode<T> next);
}
