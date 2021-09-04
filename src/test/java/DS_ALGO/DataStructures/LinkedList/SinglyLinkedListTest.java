package DS_ALGO.DataStructures.LinkedList;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        System.out.println("Insertion After Given Node");
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        for (int i = 1; i <= 4; i++) {
            sll.insertAtEnd(i);
        }
        sll.printSLL();

        System.out.println("\nInserting 8 in 1 position");
        sll.insertByPosition(8, 1);
        sll.printSLL();
        System.out.println("\nInserting 10 in 3 position");
        sll.insertByPosition(10, 3);
        sll.printSLL();
        assertFalse(sll.isEmpty());
    }

    @Test
    void testDeleteByPosition() {
        System.out.println("Insertion After Given Node");
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        for (int i = 1; i <= 4; i++) {
            sll.insertAtEnd(i);
        }
        sll.printSLL();

        System.out.println("\nDelete from 1 position");
        sll.deleteByPosition(1);
        sll.printSLL();
        System.out.println("\nDelete from 3 position");
        sll.deleteByPosition(3);
        sll.printSLL();
        assertFalse(sll.isEmpty());
    }


    @Test
    void testDeleteByValue() {
        System.out.println("Insertion After Given Node");
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        for (int i = 1; i <= 4; i++) {
            sll.insertAtEnd(i);
        }
        sll.printSLL();

        System.out.println("\nDelete value 2");
        sll.deleteByValue(2);
        sll.printSLL();
        System.out.println("\nDelete from 4");
        sll.deleteByValue(4);
        sll.printSLL();
        System.out.println("\nDelete from 1");
        sll.deleteByValue(1);
        sll.printSLL();
        assertFalse(sll.isEmpty());
        System.out.println("\nDelete from 3");
        sll.deleteByValue(3);
        sll.printSLL();
        assertTrue(sll.isEmpty());
    }


}
