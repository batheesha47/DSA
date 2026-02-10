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
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    
    public void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }
    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        
        
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        MergeSort s = new MergeSort();
        int[] data = {10,25,3,43,65,14};

        System.out.println("Merge Sort");
        System.out.println("Initial Array: " + Arrays.toString(data));

        s.sort(data, 0, data.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(data));
    }
    
}
