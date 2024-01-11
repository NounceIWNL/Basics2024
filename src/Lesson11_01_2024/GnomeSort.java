package Lesson11_01_2024;

public class GnomeSort {
    static int[] arr = {3, 1, 2, 6, 7, 5, 2, 4};
    static int size =arr.length;

    public static void main(String[] args) {
        gnomeSort();
        System.out.println(Arrays.toString(arr));
    }

    public static void gnomeSort() {
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--)
                swap(j, j - 1);
        }
    }

    static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
