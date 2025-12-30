/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Stack;

/**
 *
 * @author Batheesha
 */
public class DoublyLinkedList {

    /**
     * @param args the command line arguments
     */
    
        // Node class
        class Node {
            int data;
            Node prev;
            Node next;

            Node(int data) {
                this.data = data;
                this.prev = null;
                this.next = null;
            }
        }

        private Node head;
        private Node tail;
        private int size;

        // Constructor
        public DoublyLinkedList() {
            head = null;
            tail = null;
            size = 0;
        }

        // Add at beginning
        public void addFirst(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            size++;
        }

        // Add at end
        public void addLast(int data) {
            Node newNode = new Node(data);

            if (tail == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            size++;
        }

        // Remove first
        public int removeFirst() {
            if (head == null) {
                System.out.println("List is empty");
                return -1;
            }

            int data = head.data;

            if (head == tail) { // Only one node
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }

            size--;
            return data;
        }

        // Remove last
        public int removeLast() {
            if (tail == null) {
                System.out.println("List is empty");
                return -1;
            }

            int data = tail.data;

            if (head == tail) { // Only one node
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }

            size--;
            return data;
        }

        // Display forward
        public void displayForward() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            Node temp = head;
            System.out.print("Forward: ");
            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // Display backward
        public void displayBackward() {
            if (tail == null) {
                System.out.println("List is empty");
                return;
            }

            Node temp = tail;
            System.out.print("Backward: ");
            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.prev;
            }
            System.out.println("null");
        }

        // Get size
        public int size() {
            return size;
        }

        // Check empty
        public boolean isEmpty() {
            return size == 0;
        }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(40);
        list.addLast(50);
        
        list.displayForward();
        list.displayBackward();
        System.out.println("Size: " + list.size());
        
        System.out.println("Removed first: " + list.removeFirst());
        list.displayForward();
        
        System.out.println("Removed last: " + list.removeLast());
        list.displayForward();
    }
    
}
