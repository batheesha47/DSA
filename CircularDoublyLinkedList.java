/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Stack;

/**
 *
 * @author Batheesha
 */
public class CircularDoublyLinkedList {

    /**
     * @param args the command line arguments
     */
     // Node class for Circular Doubly Linked List
    private static class Node {
        int data;
        Node prev;
        Node next;
        
        Node(int data) {
            this.data = data;
        }
    }
    
    private Node head;   // Points to the first node
    private int size;    // Number of nodes in the list
    
    // Constructor
    public CircularDoublyLinkedList() {
        head = null;
        size = 0;
    }
    
    // 1. Add element at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            // List is empty
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node last = head.prev;
            
            newNode.next = head;
            newNode.prev = last;
            last.next = newNode;
            head.prev = newNode;
            
            head = newNode; // Update head to new node
        }
        size++;
    }
    
    // 2. Add element at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            // List is empty
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node last = head.prev;
            
            last.next = newNode;
            newNode.prev = last;
            newNode.next = head;
            head.prev = newNode;
        }
        size++;
    }
    
    // 3. Remove element from the beginning
    public int removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return -1;
        }
        
        int data = head.data;
        
        if (size == 1) {
            head = null;
        } else {
            Node last = head.prev;
            Node nextNode = head.next;
            
            nextNode.prev = last;
            last.next = nextNode;
            head = nextNode; // Move head to next node
        }
        size--;
        return data;
    }
    
    // 4. Remove element from the end
    public int removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return -1;
        }
        
        Node last = head.prev;
        int data = last.data;
        
        if (size == 1) {
            head = null;
        } else {
            Node secondLast = last.prev;
            
            secondLast.next = head;
            head.prev = secondLast;
        }
        size--;
        return data;
    }
    
    // Display all elements in the list
    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        
        Node temp = head;
        System.out.print("List: ");
        do {
            System.out.print(temp.data + " , ");
            temp = temp.next;
        } while (temp != head);
        
        System.out.println("(Back to Head)");
    }
    
    // Check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Return size of the list
    public int size() {
        return size;
    }
//main method
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        
        list.addLast(20);
        list.display();
        
        list.addLast(25);
        list.display();
        
        list.addFirst(8);
        list.display();
        
        list.addLast(70);
        list.display();
        
        list.addFirst(12);
        list.display();
        
        System.out.println("Removed First: " + list.removeFirst());
        System.out.println("Removed Last: " + list.removeLast());
        
        list.display();
    }
    
}
