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
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            System.out.println("Step " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        SelectionSort s = new SelectionSort();
        int[] data = {10,25,3,43,65,14};

        System.out.println("Selection Sort Algorithm");
        System.out.println("Initial Array: " + Arrays.toString(data));

        s.sort(data);

        System.out.println("Sorted Array: " + Arrays.toString(data));
    }
    
}
