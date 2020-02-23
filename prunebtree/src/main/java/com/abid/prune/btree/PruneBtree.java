package com.abid.prune.btree;

/**
 * Given a binary tree where all nodes are either 0 or 1, prune the tree so that subtrees containing all 0s are removed.
 * <p>
 * For example, given the following tree:
 * <p>
 * 0
 * / \
 * 1   0
 * / \
 * 1   0
 * / \
 * 0   0
 * should be pruned to:
 * <p>
 * 0
 * / \
 * 1   0
 * /
 * 1
 */
public class PruneBtree {

    public static boolean prune(Node root) {
        if (root == null) {
            return true;
        }


        boolean purneLeft = prune(root.getLeft());
        boolean purneRight = prune(root.getRight());
        if (purneLeft && purneRight) {
            root.setLeft(null);
            root.setRight(null);
        }

        return root.getX() == 0 && purneLeft && purneRight;

    }

}
