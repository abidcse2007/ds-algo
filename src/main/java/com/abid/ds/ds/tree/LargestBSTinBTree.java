package com.abid.ds.ds.tree;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class LargestBSTinBTree {
    public Result findLargestBSTinBTree(Node root){
        if(root ==null){
            return new Result(0,0,0, 0, true);
        }
        if(root.left == null &&  root.right == null){
            return new Result(1,root.n, root.n, 1, true);
        }

        Result  fromLeftSubTree = findLargestBSTinBTree(root.left);
        Result  fromRightSubTree = findLargestBSTinBTree(root.right);

        int size = 1 + fromLeftSubTree.size + fromRightSubTree.size;
        int min = Math.min(root.n, Math.min(fromLeftSubTree.min, fromRightSubTree.min));
        int max = Math.max(root.n, Math.max(fromLeftSubTree.max, fromRightSubTree.max));

       if(fromLeftSubTree.isBST && fromRightSubTree.isBST &&  fromLeftSubTree.max < root.n &&  root.n < fromRightSubTree.min){
           return  new Result(size,min, max, size, true);
       }

       return  new Result(size,min,max,Math.max(fromLeftSubTree.maxSize,fromRightSubTree.maxSize),false);

    }

    @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Node{
        int n;
        Node left;
        Node right;
    }


    @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Result{
        int size;
        int min;
        int max;
        int maxSize;
        boolean isBST;
    }


}
