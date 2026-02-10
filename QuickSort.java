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


public class QuickSort {

    /**
     * @param args the command line arguments
     */
    
    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
    
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        QuickSort s = new QuickSort();
        int[] data = {10,25,3,43,65,14};

        System.out.println("Quick Sort");
        System.out.println("Initial Array: " + Arrays.toString(data));

        s.sort(data, 0, data.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(data));
    }
    
}
