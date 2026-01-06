/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Stack;

/**
 *
 * @author Batheesha
 */
public class LinkedListStack {

    /**
     * @param args the command line arguments
     */
     private static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head; //head is the top of stack
    private int size;
    
    public LinkedListStack(){
        head = null;
        size = 0;
    }
    
    //push element on to top of the stack (add to head)
    public void push(int x){
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
        size++;
        System.out.println("Pushed: " + x);
    }
    
    //removes and return the element on top of the stack (delete from head)
    public int pop(){
        if(isEmpty()){
            throw new java.util.NoSuchElementException("Stack is empty");
        }
        
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }
    
    //return the element on top of the stack without removing
    public int peek(){
        if(isEmpty()){
            throw new java.util.NoSuchElementException("Stack is empty");
        }
        
        return head.data;
    }
    
    // Display all elements in stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        
        Node temp = head;
        System.out.print("Stack (Top to Bottom): ");
        
        while (temp != null) {
            System.out.print(temp.data + " , ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    // Get size of stack
    public int getSize() {
        return size;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        
        
        System.out.println("Initial state:");
        System.out.println("isEmpty: " + stack.isEmpty());
        stack.display();
        
        System.out.println("\nPushing elements:");
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);
        
        System.out.println("\nCurrent stack:");
        stack.display();
        System.out.println("Size: " + stack.getSize());
        System.out.println("Peek (top element): " + stack.peek());
        
        System.out.println("\nPopping elements:");
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        
        System.out.println("\nAfter popping:");
        stack.display();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.getSize());
        
        System.out.println("\nPushing more elements:");
        stack.push(11);
        stack.push(13);
        
        System.out.println("\nFinal stack:");
        stack.display();
        System.out.println("isEmpty: " + stack.isEmpty());
        
        // Test empty stack
        System.out.println("Testing empty stack");
        LinkedListStack emptyStack = new LinkedListStack();
        emptyStack.display();
        System.out.println("isEmpty: " + emptyStack.isEmpty());
        
        // Uncomment to test exception
        // System.out.println("Trying to pop from empty stack:");
        // emptyStack.pop();
    }
    
}
