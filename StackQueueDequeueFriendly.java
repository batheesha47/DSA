
package Stack;

/**
 *
 * @author Batheesha
 */
import java.util.Stack;
public class StackQueueDequeueFriendly {

    private Stack<Integer> enqueueStack;  // For adding elements
    private Stack<Integer> dequeueStack;  // For removing elements
    
    // Constructor
    public StackQueueDequeueFriendly() {
        enqueueStack = new Stack<>();
        dequeueStack = new Stack<>();
    }
    
    // Add element (enqueue)
    public void enqueue(int value) {
        enqueueStack.push(value);
    }
    
    // Remove element (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        
        // If dequeueStack is empty, transfer all elements
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        
        return dequeueStack.pop();
    }
    
    // Peek front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        
        // If dequeueStack is empty, transfer all elements
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        
        return dequeueStack.peek();
    }
    
    // Check if queue is empty
    public boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }
    
    // Get size
    public int size() {
        return enqueueStack.size() + dequeueStack.size();
    }
    
    // Display queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        
        System.out.print("Queue: ");
        
        // Display dequeueStack (in reverse order)
        Stack<Integer> temp = new Stack<>();
        while (!dequeueStack.isEmpty()) {
            temp.push(dequeueStack.pop());
        }
        
        while (!temp.isEmpty()) {
            int value = temp.pop();
            System.out.print(value + " ");
            dequeueStack.push(value);
        }
        
        // Display enqueueStack
        for (int i = 0; i < enqueueStack.size(); i++) {
            System.out.print(enqueueStack.get(i) + " ");
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        StackQueueDequeueFriendly queue = new StackQueueDequeueFriendly();
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        
        queue.display();
        System.out.println("Front: " + queue.peek());
        System.out.println("Size: " + queue.size());
        
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        
        queue.display();
        
        queue.enqueue(50);
        queue.enqueue(60);
        
        queue.display();
        
        while (!queue.isEmpty()) {
            System.out.println("Dequeue: " + queue.dequeue());
        }
        
        System.out.println("Is empty: " + queue.isEmpty());
    
    }
    
}
