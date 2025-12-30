package Stack;

public class ArrayCircularQueue {

    int[] arr;          // array to keep values
    int head, tail;     // front and rear pointers
    int count;          // number of elements
    int max;            // maximum capacity

    // constructor
    public ArrayCircularQueue(int max) {
        this.max = max;
        arr = new int[max];
        head = 0;
        count = 0;
        tail = max - 1;
    }

    // check the queue is full
    boolean full() {
        return count == max;
    }

    // check the queue is empty
    boolean empty() {
        return count == 0;
    }

    // add element
    void insert(int value) {
        if (full()) {
            System.out.println("Queue is Full");
            return;
        }

        tail = (tail + 1) % max;
        arr[tail] = value;
        count++;
    }

    // remove element
    int remove() {
        if (empty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = arr[head];
        head = (head + 1) % max;
        count--;

        return value;
    }
    
    // Display all elements in queue
    void display() {
        if (empty()) {
            System.out.println("Queue is Empty");
            return;
        }
        
        System.out.print("Queue elements: ");
        int current = head;
        for (int i = 0; i < count; i++) {
            System.out.print(arr[current] + " ");
            current = (current + 1) % max;
        }
        System.out.println();
    }
    
    // Peek front element without removing
    int peek() {
        if (empty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[head];
    }
    
    // Get current size
    int size() {
        return count;
    }

    public static void main(String[] args) {

        ArrayCircularQueue cq = new ArrayCircularQueue(5);

        System.out.println("Testing Circular Queue");
        
        // Insert elements
        System.out.println("\n1. Inserting elements:");
        cq.insert(10);
        cq.insert(20);
        cq.insert(30);
        cq.insert(40);
        
        //display queue
        cq.display();
        System.out.println("Current size: " + cq.count);
        
        // Remove elements
        System.out.println("\n2. Removing elements:");
        System.out.println("Dequeued: " + cq.remove());
        System.out.println("Dequeued: " + cq.remove());
        
        // Display after removal
        cq.display();
        System.out.println("Current size: " + cq.size());
        
        // Insert more elements
        System.out.println("\n3. Inserting more elements:");
        cq.insert(50);
        cq.insert(60);
        cq.insert(70);
        
        cq.display();
        
        // Test peek
        System.out.println("\n4. Peek front element: " + cq.peek());
        
        // Test full condition
        System.out.println("\n5. Testing full condition:");
        cq.insert(80);  // Should show "Queue is Full"
        
        // Remove all elements
        System.out.println("\n6. Removing all elements:");
        while (!cq.empty()) {
            System.out.println("Dequeued: " + cq.remove());
        }
        
        // Test empty queue
        System.out.println("\n7. Testing empty queue:");
        cq.display();
        System.out.println("Is empty: " + cq.empty());
    }
}