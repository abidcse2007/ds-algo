package com.abid.ds.disjoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindLowestCostConfiguration {

    public int findLowestCost(List<Vertex> vertices, List<Edge> edges) {

        DisjointSet disjointSet = new DisjointSet(vertices);
        Collections.sort(edges);
        List<Edge> result = new ArrayList<>();
        int cost = 0;
        for (Edge edge : edges) {
            Vertex v1 = disjointSet.find(edge.getSource());
            Vertex v2 = disjointSet.find(edge.getDestination());
            if (v1.getLabel() == v2.getLabel()) {
                continue;
            }

            result.add(edge);
            cost += edge.getWeight();
            disjointSet.union(v1, v2);
        }

        return cost;
    }
}
