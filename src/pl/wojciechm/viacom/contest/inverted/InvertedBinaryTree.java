package pl.wojciechm.viacom.contest.inverted;

import java.util.ArrayDeque;

/**
 * Created by wojciechm on 2015-07-08.
 */
public class InvertedBinaryTree {

    /**
     * Invert the supplied BinaryTree in-place.
     * Avoids recursion to support large trees.
     * Trees that don't fit in memory could be inverted by being passed to this functions separately
     * (treating subtrees just like regular trees) - all comes down to the storage scheme.
     * @param tree The binary tree that is to be inverted.
     */
    public static void invert(TreeNode tree) {
        if (tree == null) {
            return;
        }
        ArrayDeque<TreeNode> awaiting = new ArrayDeque<TreeNode>();
        awaiting.push(tree);
        while(!awaiting.isEmpty()) {
            TreeNode current = awaiting.poll();
            if (current.left != null) {
                awaiting.push(current.left);
            }
            if (current.right != null) {
                awaiting.push(current.right);
            }
            TreeNode tmp = current.left;
            current.left = current.right;
            current.right = tmp;
        }
    }

    /**
     * Prints the supplied BinaryTree to stdout.
     * Doesn't avoid recursion as is meant only to allow a quick empiracal test.
     * @param node The binary tree that is to be printed to stdout.
     */
    public static void print(TreeNode node) {
        System.out.print(String.format(" %d ", node.val));
        if (node.left != null) {
            System.out.print(" Left: (");
            InvertedBinaryTree.print(node.left);
            System.out.print(") ");
        }
        if (node.right != null) {
            System.out.print(" Right: (");
            InvertedBinaryTree.print(node.right);
            System.out.print(") ");
        }
    }
}
