package pl.wojciechm.viacom.contest.inverted;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wojciechm on 2015-07-08.
 */
public class InvertedBinaryTreeTest {

    /**
     * Sorry - no time to write a proper test for this
     * @throws Exception
     */
    @Test
    public void testInvert() throws Exception {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode leftleft = new TreeNode(4);
        TreeNode leftright = new TreeNode(5);
        TreeNode right = new TreeNode(3);
        TreeNode rightleft = new TreeNode(6);
        TreeNode rightright = new TreeNode(7);
        root.left = left;
        root.right = right;
        left.left = leftleft;
        left.right = leftright;
        right.left = rightleft;
        right.right = rightright;
        InvertedBinaryTree.print(root);
        System.out.println();
        InvertedBinaryTree.invert(root);
        InvertedBinaryTree.print(root);
    }
}