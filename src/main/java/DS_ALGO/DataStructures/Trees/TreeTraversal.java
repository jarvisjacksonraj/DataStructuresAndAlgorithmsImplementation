package DS_ALGO.DataStructures.Trees;

public class TreeTraversal {

    static void postorderRecursion(BinaryTreeNode rootNode) {
        if (rootNode != null) {
            postorderRecursion(rootNode.left);
            postorderRecursion(rootNode.right);
            System.out.print(rootNode.value + " ");
        }
    }

    static void preorderRecursion(BinaryTreeNode rootNode) {
        if (rootNode != null) {
            System.out.print(rootNode.value + " ");
            preorderRecursion(rootNode.left);
            preorderRecursion(rootNode.right);
        }
    }

    static void inorderRecursion(BinaryTreeNode rootNode) {
        if (rootNode != null) {
            inorderRecursion(rootNode.left);
            System.out.print(rootNode.value + " ");
            inorderRecursion(rootNode.right);
        }
    }
}
