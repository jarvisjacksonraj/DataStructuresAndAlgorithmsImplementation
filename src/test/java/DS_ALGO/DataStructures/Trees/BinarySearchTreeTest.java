package DS_ALGO.DataStructures.Trees;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BinarySearchTreeTest {

    private BinarySearchTree<Integer> binarySearchTree1;
    private BinarySearchTree<Integer> binarySearchTree2;
    private BinarySearchTree<Integer> binarySearchTree3;


    @BeforeAll
    public void setUp() {
        binarySearchTree1 = new BinarySearchTree<>();
        binarySearchTree2 = new BinarySearchTree<>();
        binarySearchTree3 = new BinarySearchTree<>();
        List<Integer> list = Arrays.asList(16, 8, 18, 5, 9, 17, 22, 2);
        List<Integer> identicalList = Arrays.asList(50, 30, 20, 40, 70, 60, 80);
        initializeTree(binarySearchTree1, identicalList);
        initializeTree(binarySearchTree2, identicalList);
        initializeTree(binarySearchTree3, list);

    }

    private void initializeTree(BinarySearchTree<Integer> binarySearchTree, List<Integer> list) {
        for (Integer element : list) {
            binarySearchTree.insertBST(element);
        }
    }

    private void printTree(BinaryTreeNode<Integer> binarySearchTreeRootNode) {
        binarySearchTreeRootNode.print("", binarySearchTreeRootNode, false);
    }


    @Test
    public void testDeleteBST() {
        printTree(binarySearchTree1.rootNode);
        System.out.println();
        binarySearchTree1.delete(20);
        printTree(binarySearchTree1.rootNode);
        System.out.println();
        binarySearchTree1.delete(70);
        printTree(binarySearchTree1.rootNode);
        System.out.println();
        binarySearchTree1.delete(50);
        printTree(binarySearchTree1.rootNode);
        System.out.println();
    }


    @Test
    public void testBSTTraversal() {
        binarySearchTree1.inorderTraversal();
        System.out.println();
        binarySearchTree1.preorderTraversal();
        System.out.println();
        binarySearchTree1.postorderTraversal();
    }

    @Test
    public void testInsertionBST() {
        printTree(binarySearchTree1.rootNode);
        System.out.println();
        binarySearchTree1.insertBST(110);
        printTree(binarySearchTree1.rootNode);
        System.out.println();
        binarySearchTree1.insertBST(10);
        printTree(binarySearchTree1.rootNode);
        System.out.println();
        binarySearchTree1.insertBST(90);
        printTree(binarySearchTree1.rootNode);
        System.out.println();
    }

    @Test
    public void testEmptyBinarySearchTree() {
        assertTrue(binarySearchTree1.searchBST(60));
        assertTrue(binarySearchTree1.searchBST(30));
        assertFalse(binarySearchTree1.searchBST(34));
    }
}
