package com.abid.ds.disjoint;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindLowestCostConfigurationTest {

    @Test
    public void testOne(){

        Vertex p = new Vertex('p', 0, null);
        Vertex a = new Vertex('a', 0, null);
        Vertex b = new Vertex('b', 0, null);
        Vertex c = new Vertex('c', 0, null);

        List<Vertex>  vertices = new ArrayList<>();
        vertices.add(p);
        vertices.add(a);
        vertices.add(b);
        vertices.add(c);

        Edge  pa= new Edge(p,a,1);
        Edge  pb= new Edge(p,b,5);
        Edge  pc= new Edge(p,c,20);
        Edge  ac= new Edge(a,c,15);
        Edge  bc= new Edge(b,c,10);

        List<Edge> edges = new ArrayList<>();
        edges.add(pa);
        edges.add(pb);
        edges.add(pc);
        edges.add(ac);
        edges.add(bc);


        Assertions.assertEquals(16, new FindLowestCostConfiguration().findLowestCost(vertices,edges));
    }
}
