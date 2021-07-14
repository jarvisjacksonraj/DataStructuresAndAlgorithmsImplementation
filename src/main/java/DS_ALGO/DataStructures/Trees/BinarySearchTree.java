package DS_ALGO.DataStructures.Trees;

public class BinarySearchTree<T extends Comparable<T>> {

    BinaryTreeNode<T> rootNode;

    public void insertBST(T key) {
        this.rootNode = insertRecursion(rootNode, key);
    }

    public boolean searchBST(T key) {
        return searchRecursion(rootNode, key);
    }

    public void delete(T value) {
        rootNode = deleteRecursion(rootNode, value);
    }

    public void inorderTraversal() {
        TreeTraversal.inorderRecursion(rootNode);
    }

    public void preorderTraversal() {
        TreeTraversal.preorderRecursion(rootNode);
    }

    public void postorderTraversal() {
        TreeTraversal.postorderRecursion(rootNode);
    }

    private boolean searchRecursion(BinaryTreeNode<T> rootNode, T value) {
        if (rootNode == null) {
            return false;
        }

        int comparedValue = value.compareTo(rootNode.value);

        if (comparedValue < 0) {
            return searchRecursion(rootNode.left, value);
        } else if (comparedValue > 0) {
            return searchRecursion(rootNode.right, value);
        } else {
            return true;
        }
    }

    private BinaryTreeNode<T> insertRecursion(BinaryTreeNode<T> rootNode, T value) {
        if (rootNode == null) {
            rootNode = new BinaryTreeNode<>(value);
        }

        int comparatorValue = value.compareTo(rootNode.value);

        if (comparatorValue < 0) {
            rootNode.left = insertRecursion(rootNode.left, value);
        } else if (comparatorValue > 0) {
            rootNode.right = insertRecursion(rootNode.right, value);
        }

        return rootNode;
    }

    private BinaryTreeNode<T> deleteRecursion(BinaryTreeNode<T> rootNode, T value) {
        if (rootNode == null) {
            return null;
        }

        int comparatorValue = value.compareTo(rootNode.value);

        if (comparatorValue < 0) {
            rootNode.left = deleteRecursion(rootNode.left, value);
        } else if (comparatorValue > 0) {
            rootNode.right = deleteRecursion(rootNode.right, value);
        } else {
            if (rootNode.left == null) {
                BinaryTreeNode rightRootNode = rootNode.right;
                rootNode.value = null;
                rootNode = null;
                return rightRootNode;
            } else if (rootNode.right == null) {
                BinaryTreeNode leftRootNode = rootNode.left;
                rootNode.value = null;
                rootNode = null;
                return leftRootNode;
            } else {
                BinaryTreeNode<T> tempTreeNode = downRight(rootNode.left);
                rootNode.value = tempTreeNode.value;
                rootNode.left = deleteRecursion(rootNode.left, tempTreeNode.value);
            }
        }

        return rootNode;
    }

    private BinaryTreeNode<T> downRight(BinaryTreeNode<T> rootNode) {
        BinaryTreeNode current = rootNode;
        while (current.left != null) {
            current = current.left;
        }
        return rootNode;
    }







/*
Leaf
Right No left
Left No Right
Both Left Right
*/
}
