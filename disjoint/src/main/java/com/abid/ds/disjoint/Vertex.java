package com.abid.ds.disjoint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Vertex {
    char label;
    int rank;
    Vertex parent;
}
