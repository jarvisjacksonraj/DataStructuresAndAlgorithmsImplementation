package DS_ALGO.DataStructures.LinkedList;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class SinglyLinkedListTest {

    @Test
    void testInsertAtHead() {
        System.out.println("Insertion by Head");
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
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
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
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
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        for (int i = 1; i <= 6; i++) {
            sll.insertAtEnd(i); // inserting value at the tail of the list
        }
        sll.printSLL();

        System.out.println ("\nInserting 8 after 2");
        sll.insertAfter(8, 2);
        sll.printSLL();   // calling insert after
        System.out.println ("\nInserting 10 after 3");
        sll.insertAfter (10, 3);   // calling insert after
        sll.printSLL();
        assertFalse(sll.isEmpty());
    }


}
