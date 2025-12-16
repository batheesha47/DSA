
package Stack;

import java.util.Stack;

public class QueueStackPopFriendly {
    
    private Stack<Integer> mainStack;
    private Stack<Integer> helperStack;
    
    public QueueStackPopFriendly() {
        mainStack = new Stack<>();
        helperStack = new Stack<>();
    }
    
    //Enqueue
    
    public void enqueue(int x) {
        while (!mainStack.isEmpty()) {
            helperStack.push(mainStack.pop());
        }
        mainStack.push(x);
        while (!helperStack.isEmpty()) {
            mainStack.push(helperStack.pop());
        }
        System.out.println("Push : " + x);
    }
    
    //Dequeue
    
    public int dequeue() {
        if (mainStack.isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return mainStack.pop();}
    
    
    
    public static void main(String[] args) {
        
        QueueStackPopFriendly q = new QueueStackPopFriendly();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Pop : " + q.dequeue());  
        System.out.println("Pop : " + q.dequeue());
        
        q.enqueue(40);
        
        System.out.println("Pop : " + q.dequeue());
        
        
    }
    
}
