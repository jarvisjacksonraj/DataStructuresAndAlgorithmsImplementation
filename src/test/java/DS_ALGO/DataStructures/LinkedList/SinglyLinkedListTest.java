package DS_ALGO.DataStructures.LinkedList;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedListTest {

    @Test
    void testInsertAtHead() {
        System.out.println("Insertion by Head");
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.printSLL();
        for (int i = 1; i <= 10; i++) {
            sll.insertAtHead(i);
            sll.printSLL();
        }
        assertFalse(sll.isEmpty());
    }

    @Test
    void testInsertAtEnd() {
        System.out.println("Insertion by Tail");
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.printSLL();
        for (int i = 1; i <= 10; i++) {
            sll.insertAtEnd(i);
            sll.printSLL();
        }
        assertFalse(sll.isEmpty());
    }

    @Test
    void testInsertAfter() {
        System.out.println("Insertion After Given Node");
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        for (int i = 1; i <= 6; i++) {
            sll.insertAtEnd(i);
        }
        sll.printSLL();

        System.out.println("\nInserting 8 after 2");
        sll.insertAfter(8, 2);
        sll.printSLL();
        System.out.println("\nInserting 10 after 3");
        sll.insertAfter(10, 3);
        sll.printSLL();
        assertFalse(sll.isEmpty());
    }

    @Test
    void testInsertByPosition() {
        System.out.println("Insertion Node By Given Position");
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        for (int i = 1; i <= 4; i++) {
            sll.insertAtEnd(i);
        }
        sll.printSLL();

        System.out.println("\nInserting Node 8 in 1 position");
        sll.insertByPosition(8, 1);
        assertTrue(sll.searchNode(8));
        sll.printSLL();
        System.out.println("\nInserting Node 10 in 3 position");
        sll.insertByPosition(10, 3);
        assertTrue(sll.searchNode(10));
        sll.printSLL();
        assertFalse(sll.isEmpty());
    }

    @Test
    void testDeleteByPosition() {
        System.out.println("Delete Node with given position");
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        for (int i = 1; i <= 4; i++) {
            sll.insertAtEnd(i);
        }
        sll.printSLL();

        System.out.println("\nDelete from 1 position");
        sll.deleteByPosition(1);
        assertFalse(sll.searchNode(1));
        sll.printSLL();
        System.out.println("\nDelete from 3 position");
        sll.deleteByPosition(3);
        assertFalse(sll.searchNode(4));
        sll.printSLL();
        assertFalse(sll.isEmpty());
    }

    @Test
    void testDeleteByValue() {
        System.out.println("Delete Node with given Value");
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        for (int i = 1; i <= 4; i++) {
            sll.insertAtEnd(i);
        }
        sll.printSLL();

        System.out.println("\nDelete value 2");
        sll.deleteByValue(2);
        assertFalse(sll.searchNode(2));
        sll.printSLL();
        System.out.println("\nDelete from 4");
        sll.deleteByValue(4);
        assertFalse(sll.searchNode(4));
        sll.printSLL();
        System.out.println("\nDelete from 1");
        sll.deleteByValue(1);
        assertFalse(sll.searchNode(1));
        sll.printSLL();
        assertFalse(sll.isEmpty());
        System.out.println("\nDelete from 3");
        sll.deleteByValue(3);
        assertFalse(sll.searchNode(3));
        sll.printSLL();
        assertTrue(sll.isEmpty());
    }

    @Test
    void testGetNodeValueByIndex() {
        System.out.println("Get Node with given Value By Index");
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        for (int i = 1; i <= 4; i++) {
            sll.insertAtEnd(i);
        }
        sll.printSLL();
        System.out.println("\nNode Value in 1 position");
        assertEquals(1, sll.getNodeValueByIndex(1));
        sll.printSLL();
        System.out.println("\nNode Value in 3 position");
        assertEquals(3, sll.getNodeValueByIndex(3));
        sll.printSLL();
        assertFalse(sll.isEmpty());
    }

    @Test
    void testSearchNode() {
        System.out.println("Search Node with Given value exists or not");
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        for (int i = 1; i <= 4; i++) {
            sll.insertAtEnd(i);
        }
        sll.printSLL();
        System.out.println("\nsearch Node with value 1");
        assertTrue(sll.searchNode(1));

        sll.printSLL();
        System.out.println("\nsearch Node with value 100");
        assertFalse(sll.searchNode(100));

        sll.printSLL();
        System.out.println("\nsearch Node with value 3");
        assertTrue(sll.searchNode(3));

        sll.printSLL();
        assertFalse(sll.isEmpty());
    }

}
