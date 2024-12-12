package com.gyoge;

import java.util.*;


public class Kruskal {
    int totalWeight = 0;

    private final ArrayList<Node> nodeArray = new ArrayList<>();
    private final ArrayList<Edge> edgeArray = new ArrayList<>();
    private ArrayList<Edge> path;


    public void addNode(Node node) {
        nodeArray.add(node);
    }

    public void addEdge(Edge edge) {
        edgeArray.add(edge);
    }

    public void addEdge(int from, int to, int weight) {
        if (weight == 0) {
            return;
        }
        Edge currentEdge = new Edge(nodeArray.get(from), nodeArray.get(to), weight);
        addEdge(currentEdge);
    }

    public void makeMST() {
        // Sort the edge array using the Class method sort in the Collections class
        Collections.sort(edgeArray);
        // Make an ArrayList for the edges of the path
        path = new ArrayList<>();
        // Go through all the edges in sorted order
        // If the To and From nodes on the edge are not connected:
        // Save the head of the From and To nodes in variables
        // go through all the nodes, and if the head of that node
        // is the head of the To node, change it to the head of the from node,
        // Add the edge to the path ArrayList
        // Update the totalWeight variable by adding the edge weight
        for (Edge edge : edgeArray) {
            Node from = edge.getFrom();
            Node to = edge.getTo();

            if (from.getHead() == to.getHead()) {
                continue;
            }

            Node fromHead = from.getHead();
            Node toHead = to.getHead();
            for (Node node : nodeArray) {
                if (node.getHead() == toHead) {
                    node.setHead(fromHead);
                }
            }
            path.add(edge);
            totalWeight += edge.getWeight();
        }
    }

    public String toString() {
        StringBuilder outString;
        outString = new StringBuilder("Edges:\n");

        for (Edge edge : path) {
            Node from = edge.getFrom();
            Node to = edge.getTo();
            outString
                .append(from.getData())
                .append(" to ")
                .append(to.getData())
                .append(" Weight ")
                .append(edge.getWeight())
                .append("\n");
        }

        outString
            .append("\nTotal Weight = ")
            .append(totalWeight);

        return outString.toString();
    }


}