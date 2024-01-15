package Lesson15_01_2024;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 7, 9, 11, 13, 15};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 2));
        System.out.println(runBinarySearchIteratively(arr, 5,0, arr.length));
    }



    public static int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
