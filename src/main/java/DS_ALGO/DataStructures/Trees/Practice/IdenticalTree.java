package DS_ALGO.DataStructures.Trees.Practice;

import DS_ALGO.DataStructures.Trees.BinaryTreeNode;

public class IdenticalTree {
    public static boolean areIdentical(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 != null && root2 != null) {
            return ((root1.value == root2.value) &&
                    areIdentical(root1.left, root2.left) &&
                    areIdentical(root1.right, root2.right));
        }
        return false;
    }
}
