package com.gyoge;


public class Edge implements Comparable<Edge> {
    Node from;
    Node to;
    int weight;

    public Node getFrom() {
        return from;
    }

    public Node getTo() {
        return to;
    }

    public int getWeight() {
        return weight;
    }

    public Edge(Node from, Node to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public int compareTo(Edge other) {
        return this.getWeight() - other.getWeight();
    }
}
