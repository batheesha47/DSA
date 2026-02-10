/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Stack;


import java.util.Arrays;

/**
 *
 * @author Batheesha
 */ 
public class OptimizedInsertionSort {

    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];

            // Find insertion position using binary search
            int insPos = binarySearch(arr, key, 0, i - 1);

            // Shift elements to make space
            for (int j = i - 1; j >= insPos; j--) {
                arr[j + 1] = arr[j];
            }

            arr[insPos] = key;
        }
    }
    
    private int binarySearch(int[] arr, int key, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        OptimizedInsertionSort s = new OptimizedInsertionSort();
        int[] data = {10 , 20, 70, 55, 15};

        System.out.println("Optimized Insertion Sort");
        System.out.println("Initial Array: " + Arrays.toString(data));

        s.sort(data);

        System.out.println("Sorted Array: " + Arrays.toString(data));
    }
    
}
