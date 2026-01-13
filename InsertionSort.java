/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Stack;

/**
 *
 * @author Batheesha
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    // Insertion Sort Algorithm
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        System.out.println("Original array: " + arrayToString(arr));
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            System.out.println("\nPass " + i + ":");
            System.out.println("  Key = " + key);
            
            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                System.out.println("  Shift " + arr[j+2] + " to right -> " + arrayToString(arr));
            }
            arr[j + 1] = key;
            
            if (j + 1 != i) {
                System.out.println("  Insert " + key + " at position " + (j + 1) + 
                                 " -> " + arrayToString(arr));
            } else {
                System.out.println("  " + key + " already in correct position");
            }
        }
    }
    
    // Insertion Sort with fewer prints (clean version)
    public static void insertionSortClean(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
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
        System.out.println("Insertion Sort Algorithm\n");
        
        // Test 1
        System.out.println("Test 1:");
        int[] arr1 = {12, 11, 13, 5, 6};
        insertionSort(arr1);
        System.out.println("\nSorted array: " + arrayToString(arr1));
        
        // Test 2
        System.out.println("\n\nTest 2:");
        int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
        int[] arr2Copy = arr2.clone();
        
        System.out.println("Step-by-step sorting:");
        insertionSort(arr2);
        
        System.out.println("\nClean version (no prints):");
        insertionSortClean(arr2Copy);
        System.out.println("Sorted array: " + arrayToString(arr2Copy));
        
    }
}
