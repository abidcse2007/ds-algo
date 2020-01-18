package com.abid.ds.disjoint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Edge implements   Comparable<Edge> {
    Vertex source;
    Vertex destination;
    int weight;

    @Override
    public int compareTo(Edge o) {
        if(this.weight < o.getWeight()){
            return -1;
        } else if(this.weight > o.getWeight()){
            return  1;
        }else{
            return 0;
        }

    }
}
