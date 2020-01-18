package com.abid.ds.disjoint;

import java.util.List;

public class DisjointSet {

    public DisjointSet(List<Vertex> vertices) {
        for (Vertex vertex : vertices) {
            makeSet(vertex);
        }
    }

    public void makeSet(Vertex vertex) {
        vertex.rank = 0;
        vertex.parent = null;
    }


    public Vertex find(Vertex vertex) {
        Vertex current = vertex;

        while (current.parent != null) {
            current = current.getParent();
        }

        Vertex root = current;

        while (current != root) {
            Vertex tmp = current.getParent();
            current.setParent(root);
            current = tmp;
        }

        return root;
    }


    public void union(Vertex v1, Vertex v2) {

        Vertex root1 = find(v1);
        Vertex root2 = find(v2);

        if (root1.getLabel() == root2.getLabel()) {
            return;
        }

        if (root1.getRank() > root2.getRank()) {
            root2.setParent(root1);
            root1.setRank(root1.getRank() +1);
        } else if (root1.getRank() < root2.getRank()) {
            root1.setParent(root2);
            root2.setRank(root2.getRank() +1);
        } else {
            root2.setParent(root1);
            root1.setRank(root1.getRank() +1);
        }

    }
}
