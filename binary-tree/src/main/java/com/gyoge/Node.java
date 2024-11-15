package com.gyoge;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
    private T data;
    private Node<T> left = null;
    private Node<T> right = null;

    @Override
    public int compareTo(Node<T> other) {
        return this.data.compareTo(other.getData());
    }

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> left, Node<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

}
