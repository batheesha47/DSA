/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Stack;

/**
 *
 * @author Batheesha
 */
public class OptimizedBubbleSort {

    /**
     * @param args the command line arguments
     */
    // Optimized Bubble Sort (stops early if array is sorted)
    public static void optimizedBubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        System.out.println("Original array: " + arrayToString(arr));
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            System.out.println("\nPass " + (i + 1) + ":");
            
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    System.out.println("  Swapped " + arr[j+1] + " and " + arr[j] + 
                                     " -> " + arrayToString(arr));
                }
            }
            
            // If no swapping happened, array is sorted
            if (!swapped) {
                System.out.println("  No swaps - array is already sorted!");
                break;
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
    
    // Compare standard vs optimized bubble sort
    public static void main(String[] args) {
        System.out.println("=== Optimized Bubble Sort ===\n");
        
        // Test 1: Random array
        System.out.println("Test 1 - Random array:");
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        optimizedBubbleSort(arr1);
        System.out.println("\nSorted array: " + arrayToString(arr1));
        
        // Test 2: Already sorted array (optimized version should stop early)
        System.out.println("\n\nTest 2 - Already sorted array:");
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        optimizedBubbleSort(arr2);
        
        // Test 3: Reverse sorted array
        System.out.println("\n\nTest 3 - Reverse sorted array:");
        int[] arr3 = {6, 5, 4, 3, 2, 1};
        optimizedBubbleSort(arr3);
        System.out.println("\nSorted array: " + arrayToString(arr3));
        
        
    }
}
