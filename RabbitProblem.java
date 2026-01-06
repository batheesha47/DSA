/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Stack;

/**
 *
 * @author Batheesha
 */
public class RabbitProblem {

    /**
     * @param args the command line arguments
     */
     public static long calculateRabbitPairs(int month) {

        if (month < 0) {
            throw new IllegalArgumentException("Month cannot be negative");
        }

        if (month == 0) return 0;
        if (month == 1) return 1;

        long prev = 0;
        long curr = 1;

        for (int i = 2; i <= month; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }

    public static void main(String[] args) {

        int months = 12;

        System.out.println("Rabbit Problem (Fibonacci Series)\n");

        for (int i = 0; i <= months; i++) {
            System.out.printf("Month %2d : %d pairs%n", i, calculateRabbitPairs(i));
        }
    }
}