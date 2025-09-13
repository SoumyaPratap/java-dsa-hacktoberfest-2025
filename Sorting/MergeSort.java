package Sorting;

public class MergeSort {
    public static int[] sort(int[] arr) {
        int N = arr.length;
        if (N <= 1)
            return arr;

        int X = N / 2;
        int[] L = new int[X];
        int[] R = new int[N - X];
        for (int i = 0; i < N; i++) {
            if (i < X) {
                L[i] = arr[i];
            } else {
                R[i - X] = arr[i];
            }
        }
        L = sort(L);
        R = sort(R);
        int[] sort_arr = new int[N];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < X && j < N - X) {
            int first = L[i];
            int last = R[j];
            if (first <= last) {
                sort_arr[k] = first;
                i++;
            } else {
                sort_arr[k] = last;
                j++;
            }
        }

        while(i < X) {
            sort_arr[k] = L[i];
            i++;
            k++;
        }
        while(j < N-X) {
            sort_arr[k] = R[j];
            j++;
            k++;
        }

        return sort_arr;
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        int[] sort_arr = sort(arr);
        for (int num : sort_arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
