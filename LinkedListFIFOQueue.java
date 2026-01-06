/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Stack;

/**
 *
 * @author Batheesha
 */
public class LinkedListFIFOQueue {

    /**
     * @param args the command line arguments
     */
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node front;
    private Node rear;
    private int size;
    
    // Constructor
    public LinkedListFIFOQueue() {
        front = null;
        rear = null;
        size = 0;
    }
    
    // Enqueue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    
    // Dequeue
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        
        int data = front.data;
        front = front.next;
        
        if (front == null) {
            rear = null;
        }
        
        size--;
        return data;
    }
    
    // Peek
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }
    
    // Display
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        
        Node temp = front;
        System.out.print("Queue (Front to Rear): ");
        
        while (temp != null) {
            System.out.print(temp.data + " , ");
            temp = temp.next;
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
    
    // Main method
    public static void main(String[] args) {
        LinkedListFIFOQueue queue = new LinkedListFIFOQueue();
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        
        queue.display();
        System.out.println("Front: " + queue.peek());
        System.out.println("Size: " + queue.size());
        
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        
        queue.enqueue(50);
        queue.enqueue(60);
        
        
        queue.display();
        System.out.println("Front: " + queue.peek());
    }
    
}
