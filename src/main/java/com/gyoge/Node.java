package com.gyoge;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node<T> {
    private T item;
    private Node<T> next = null;

    public Node(T item) {
        this.item = item;
    }
}
