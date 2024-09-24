package com.gyoge;

@SuppressWarnings("unused")
public class Queue {
    private final List<String> list = new List<>();

    public void enqueue(String item) {
        this.list.append(item);
    }

    public String dequeue() {
        return this.list.removeHead();
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }
}
