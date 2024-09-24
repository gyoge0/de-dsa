package com.gyoge;

@SuppressWarnings("unused")
public class List<T> {
    private Node<T> head = null;

    public void append(T item) {
        var newNode = new Node<>(item);

        if (isEmpty()) {
            this.head = newNode;
            return;
        }

        var end = this.head;
        while (end.getNext() != null) {
            end = end.getNext();
        }

        end.setNext(newNode);
    }

    public void prepend(T item) {
        var newNode = new Node<>(item);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    public T removeHead() {
        var currentHead = this.head;
        this.head = currentHead.getNext();
        return currentHead.getItem();
    }

    public T removeTail() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        var beforeEnd = this.head;
        while (beforeEnd.getNext().getNext() != null) {
            beforeEnd = beforeEnd.getNext();
        }

        var end = beforeEnd.getNext();
        beforeEnd.setNext(null);
        return end.getItem();
    }

    public boolean isEmpty() {
        return this.head == null;
    }
}
