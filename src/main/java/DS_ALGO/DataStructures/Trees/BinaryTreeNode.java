package DS_ALGO.DataStructures.Trees;

public class BinaryTreeNode<T> {

    public T value;
    public BinaryTreeNode<T> left, right;

    public BinaryTreeNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void print(String prefix, BinaryTreeNode node, boolean isLeft) {
        if (node != null) {
            System.out.println (prefix + (isLeft ? "|-- " : "\\-- ") + node.value);
            print(prefix + (isLeft ? "|   " : "    "), node.left, true);
            print(prefix + (isLeft ? "|   " : "    "), node.right, false);
        }
    }
}

