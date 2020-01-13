package com.abid.ds.ds.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestBSTinBTreeTest {

    @Test
    public void one() {
        LargestBSTinBTree.Node nodeOne = new LargestBSTinBTree.Node(1, null, null);
        LargestBSTinBTree.Node nodeThree = new LargestBSTinBTree.Node(3, null, null);
        LargestBSTinBTree.Node nodeTwo = new LargestBSTinBTree.Node(2, nodeOne, nodeThree);
        LargestBSTinBTree.Node nodeFour = new LargestBSTinBTree.Node(4, null, null);
        LargestBSTinBTree.Node nodeFive = new LargestBSTinBTree.Node(5, nodeTwo, nodeFour);
        LargestBSTinBTree.Result result = new LargestBSTinBTree().findLargestBSTinBTree(nodeFive);
        Assertions.assertEquals(3, result.maxSize);
    }
}
