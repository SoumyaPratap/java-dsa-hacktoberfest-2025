/**
 * QuickSort Algorithm
 * Avg Time Complexity: O(n log n)
 * Worst: O(n^2)
 * Space: O(log n)
 */
package Sorting;

public class QuickSort {
    public static void sort(int[] arr) {
        quick(arr, 0, arr.length - 1);
    }

    private static void quick(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quick(arr, low, p - 1);
            quick(arr, p + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        sort(arr);
        for (int num : arr) System.out.print(num + " ");
    }
}
