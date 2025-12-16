package Stack;

import java.util.Stack;

public class UnboundedArrayStack {

    private int[] Sarr;
    private int topIndex;
    private int capacity;

    public UnboundedArrayStack() {
        capacity = 2; 
        Sarr = new int[capacity];
        topIndex = -1; 
    }

    public void push(int data) {
        if (topIndex == capacity - 1) {
            resize(capacity * 2); 
        }
        
        topIndex++;
        Sarr[topIndex] = data;
        System.out.println("Push : " + data);
    }

    public int pop() {
        if (topIndex == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int data = Sarr[topIndex];
        topIndex--;
        if (topIndex > -1 && topIndex < capacity / 4) {
            resize(capacity / 2);
        }
        
        return data; }
    private void resize(int newCapacity) {
        System.out.println(">> Resizing stack capacity from " + capacity + " to " + newCapacity);
        int[] tempArr = new int[newCapacity];
        
        for (int i = 0; i <= topIndex; i++) {
            tempArr[i] = Sarr[i];
        }
        
        Sarr = tempArr;
        capacity = newCapacity;
    }
    
    public static void main(String[] args) {
        
        UnboundedArrayStack stack = new UnboundedArrayStack();
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.push(10);
        stack.push(12);
        stack.push(14);
        stack.push(16);
        stack.push(18);
        
        System.out.println("Pop : " + stack.pop());
        System.out.println("Pop : " + stack.pop());
        System.out.println("Pop : " + stack.pop());
        System.out.println("Pop : " + stack.pop());
        System.out.println("Pop : " + stack.pop());
        System.out.println("Pop : " + stack.pop());
        
        
         
    }
    
}
