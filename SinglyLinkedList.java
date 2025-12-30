package Stack;

public class SinglyLinkedList {
    
    // Node class
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head;
    private int size;
   
    
    public SinglyLinkedList() {
        head = null;
        size = 0;
    }
    
    // Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    // Add at end
    public void addLast(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
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
        head = head.next;
        size--;
        return data;
    }
    
    // Display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
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
    
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(40);
        list.addLast(50);
        
        list.display();
        System.out.println("Size: " + list.size());
        
        System.out.println("Removed: " + list.removeFirst());
        list.display();
        
        System.out.println("Removed: " + list.removeFirst());
        list.display();
    }
}