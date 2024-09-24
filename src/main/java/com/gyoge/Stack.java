package com.gyoge;

@SuppressWarnings("unused")
public class Stack {
    private final List<String> list = new List<>();

    public void push(String item) {
        this.list.prepend(item);
    }

    public String pop() {
        return this.list.removeHead();
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }
}
