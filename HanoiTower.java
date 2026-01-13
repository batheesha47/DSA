/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Stack;

/**
 *
 * @author Batheesha
 */
public class HanoiTower {

    // Recursive solution for Tower of Hanoi
    public static void solveHanoi(int disks, char source, char auxiliary, char destination) {
        if (disks == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        
        // Move n-1 disks from source to auxiliary using destination as helper
        solveHanoi(disks - 1, source, destination, auxiliary);
        
        // Move the nth disk from source to destination
        System.out.println("Move disk " + disks + " from " + source + " to " + destination);
        
        // Move n-1 disks from auxiliary to destination using source as helper
        solveHanoi(disks - 1, auxiliary, source, destination);
    }
    
    // Count minimum moves required
    public static int countMoves(int disks) {
        // Minimum moves = 2^n - 1
        return (int) Math.pow(2, disks) - 1;
    }
    
    // Display towers visually
    public static void displayTowers(int disks) {
        System.out.println("Tower of Hanoi with " + disks + " disks");
        System.out.println("Minimum moves required: " + countMoves(disks));
    }
    
    public static void main(String[] args) {
        int disks = 3;
        
        System.out.println("Tower of Hanoi");
        displayTowers(disks);
        
        System.out.println("Solution Steps:");
        solveHanoi(disks, 'A', 'B', 'C');
        
        // Test with different number of disks
        System.out.println("Testing with 4 disks");
        displayTowers(4);
        System.out.println("First few steps for 4 disks:");
        solveHanoi(4, 'A', 'B', 'C');
    }
}
