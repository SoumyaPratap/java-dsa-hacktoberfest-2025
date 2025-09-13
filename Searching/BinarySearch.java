/**
 * Binary Search (iterative)
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
package Searching;

public class BinarySearch {
    public static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};
        int t = 7;
        int idx = search(arr, t);
        if (idx != -1) System.out.println("Found at index " + idx);
        else System.out.println("Not found");
    }
}
