package com.abid.prune.btree;


import org.junit.jupiter.api.Test;

public class PruneBtreeTest {


    /**
     *
     *
     * For example, given the following tree:
     *
     *    0
     *   / \
     *  1   0
     *     / \
     *    1   0
     *   / \
     *  0   0
     * should be pruned to:
     *
     *    0
     *   / \
     *  1   0
     *     /
     *    1
     */
    @Test
    public void prune(){

        System.out.println("==FFFFFF==");


        Node root =  new Node();
        root.setX(0);

        Node left1 = new Node();
        left1.setX(1);

        Node right1 = new Node();
        right1.setX(0);

        root.setLeft(left1);
        root.setRight(right1);

        Node rightLeft1 = new Node();
        rightLeft1.setX(1);

        Node rightRight1 = new Node();
        rightRight1.setX(0);

        right1.setLeft(rightLeft1);
        right1.setRight(rightRight1);

        Node rightLeft1Left1 = new Node();
        rightLeft1Left1.setX(0);
        rightLeft1.setLeft(rightLeft1Left1);

        Node rightLeft1Right1 = new Node();
        rightLeft1Right1.setX(0);
        rightLeft1.setRight(rightLeft1Right1);

        System.out.println("==Before==");
        print(root);
        Node ptr = root;
        new PruneBtree().prune(ptr);
        System.out.println("==After==");
        print(root);
    }


    public void print(Node root){
        while(root == null){
            return;
        }

        System.out.println(root.getX() + " ");
        print(root.getLeft());
        print(root.getRight());
    }
}
