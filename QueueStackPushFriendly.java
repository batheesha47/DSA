
package Stack;

/**
 *
 * @author Batheesha
 */
import java.util.Stack;

public class QueueStackPushFriendly {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public QueueStackPushFriendly() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }
    
    public void enqueue(int x) {
        inputStack.push(x);
        System.out.println("Push: " + x);
    }
    
    public int dequeue() {
        if (outputStack.isEmpty() && inputStack.isEmpty()) {
            System.out.println("Error: Queue is empty.");
            return -1;
        }
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.pop();
    }
    
    public static void main(String[] args) {
        QueueStackPushFriendly q = new QueueStackPushFriendly();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        
        System.out.println("Pop : " + q.dequeue());  
        System.out.println("Pop : " + q.dequeue());  
        q.enqueue(40);
        System.out.println("Pop : " + q.dequeue()); 
        q.enqueue(50);
        System.out.println("Pop : " + q.dequeue()); 
    }
}