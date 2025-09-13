/**
 * Merge Sort Algorithm
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

package Sorting;

public class MergeSort {
    public static int[] sort(int[] arr) {
        int N = arr.length;
        if (N <= 1)
            return arr;

        int mid = N / 2;
        int[] L = new int[mid];
        int[] R = new int[N - mid];
        for (int i = 0; i < mid; i++)
            L[i] = arr[i];
        for (int j = 0; j < N - mid; j++)
            R[j] = arr[j + mid];

        L = sort(L);
        R = sort(R);

        return merge(L, R);
    }

    public static int[] merge(int[] small_arr, int[] large_arr) {
        int[] merged_arr = new int[small_arr.length + large_arr.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < small_arr.length && j < large_arr.length) {
            if (small_arr[i] <= large_arr[j]) {
                merged_arr[k++] = small_arr[i++];
            } else {
                merged_arr[k++] = large_arr[j++];
            }
        }

        while (i < small_arr.length)
            merged_arr[k++] = small_arr[i++];

        while (j < large_arr.length)
            merged_arr[k++] = large_arr[j++];

        return merged_arr;
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        int[] sort_arr = sort(arr);
        for (int num : sort_arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
