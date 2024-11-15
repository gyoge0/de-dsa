package com.gyoge;

@SuppressWarnings("unused")
public class Tree<T extends Comparable<T>> {
    private Node<T> root;

    public Tree(Node<T> root) {
        this.root = root;
    }

    public void insert(T data) {
        this.root = insertHelper(this.root, data);
    }

    private Node<T> insertHelper(Node<T> current, T data) {
        if (current == null) {
            return new Node<>(data);
        }

        if (data.compareTo(current.getData()) < 0) {
            current.setLeft(insertHelper(current.getLeft(), data));
        } else {
            current.setRight(insertHelper(current.getRight(), data));
        }

        return current;
    }

    public void preOrderTraversal() {
        preOrderHelper(this.root);
    }

    private void preOrderHelper(Node<T> current) {
        System.out.println(current.getData());
        if (current.getLeft() != null) {
            preOrderHelper(current.getLeft());
        }
        if (current.getRight() != null) {
            preOrderHelper(current.getLeft());
        }
    }

    public void inOrderTraversal() {
        inOrderHelper(this.root);
    }

    private void inOrderHelper(Node<T> current) {
        if (current.getLeft() != null) {
            inOrderHelper(current.getLeft());
        }
        System.out.println(current.getData());
        if (current.getRight() != null) {
            inOrderHelper(current.getRight());
        }
    }

    public void postOrderTraversal() {
        postOrderHelper(this.root);
    }

    private void postOrderHelper(Node<T> current) {
        if (current.getLeft() != null) {
            postOrderHelper(current.getLeft());
        }
        if (current.getRight() != null) {
            postOrderHelper(current.getRight());
        }
        System.out.println(current.getData());
    }
}
