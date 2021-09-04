package DS_ALGO.DataStructures.LinkedList;

public class SinglyLinkedList<T> {

    /* * * * * * * * * * * * * * * * * * *
     * Inner class for Node Chain
     * data     :   Data to store
     * nextNode :   Pointer to next node in SLL chain
     * * * * * * * * * * * * * * * * * * *
     * * * * * * * * * * * * * * * * * * *
     * headNode :   head node of the SLL
     * size     :   size of SLL
     * * * * * * * * * * * * * * * * * * */

    public static class Node<T> {
        public Node nextNode;
        public T data;
    }


    public Node headNode;
    public int size;

    public SinglyLinkedList() {
        headNode = null;
        size = 0;
    }

    // Time complexity of isEmpty() method is O(1)
    public boolean isEmpty() {
        return headNode == null;
    }

    /**
     * Create a new node with the given value
     * Make nextPointer of newNode points to the head node
     * Make head to point to this newly created node
     */
    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;
        if (headNode != null) {
            newNode.nextNode = headNode;
        }
        headNode = newNode;
        size++;
    }

    public void insertAtEnd(T data) {
        if (isEmpty()) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;

        Node tempNode = headNode;

        while (tempNode.nextNode != null) {
            tempNode = tempNode.nextNode;
        }
        tempNode.nextNode = newNode;
        size++;
    }

    public void insertByPosition(T data, int position) {
        if (position == 1) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node();
        newNode.data = data;

        Node currentNode = headNode;
        for (int i = 0; i < position-2; i++) {
            currentNode = currentNode.nextNode;
        }
        newNode.nextNode = currentNode.nextNode;
        currentNode.nextNode = newNode;
        size++;
    }

    public void insertAfter(T data, T previous) {
        Node newNode = new Node();
        newNode.data = data;

        Node currentNode = headNode;
        while (currentNode != null && !currentNode.data.equals(previous)) {
            currentNode = currentNode.nextNode;
        }
        if (currentNode != null) {
            newNode.nextNode = currentNode.nextNode;
            currentNode.nextNode = newNode;
            size++;
        }

    }

    public void deleteAtHead() {
        if (headNode != null) {
            headNode = headNode.nextNode;
        }
        size--;
    }

    public void deleteByPosition(int position) {
        if (position == 1) {
            deleteAtHead();
            return;
        }

        Node currentNode = headNode;
        for (int i = 0; i < position-2; i++) {
            currentNode = currentNode.nextNode;
        }
        Node nextNode = currentNode.nextNode;
        currentNode.nextNode = nextNode.nextNode;
        size--;
    }

    public void deleteByValue(T data){
        if (isEmpty())
            return;

        Node currentNode = this.headNode;
        Node previousNode = null;

        if(currentNode.data.equals(data)) {
            deleteAtHead();
            return;
        }

        while (currentNode != null) {
            if (data.equals(currentNode.data)){
                previousNode.nextNode = currentNode.nextNode;
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.nextNode;
        }
        size--;
    }

    public void printSLL() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }
        Node tempNode = headNode;
        System.out.print("List : ");
        while (tempNode.nextNode != null) {
            System.out.print(tempNode.data.toString() + " -> ");
            tempNode = tempNode.nextNode;
        }
        System.out.println(tempNode.data.toString() + " -> null");
    }
}