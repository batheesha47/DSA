/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Stack;

/**
 *
 * @author Batheesha
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    // Standard Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        System.out.println("\nOriginal array: " + arrayToString(arr));
        
        for (int i = 0; i < n - 1; i++) {
            System.out.println("\nPass " + (i + 1) + ":");
            
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println("  Swapped " + arr[j+1] + " and " + arr[j] + 
                                     " -> " + arrayToString(arr));
                }
            }
        }
    }
    
    // Helper method to convert array to string
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    // Test the algorithm
    public static void main(String[] args) {
        System.out.println("=== Bubble Sort Algorithm ===\n");
        
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Sorting array: " + arrayToString(arr1));
        
        bubbleSort(arr1);
        
        System.out.println("\nSorted array: " + arrayToString(arr1));
        
        // Another test
        System.out.println("\n\n=== Another Test ===");
        int[] arr2 = {5, 1, 4, 2, 8};
        System.out.println("Sorting array: " + arrayToString(arr2));
        bubbleSort(arr2);
        System.out.println("\nSorted array: " + arrayToString(arr2));
    }
}
