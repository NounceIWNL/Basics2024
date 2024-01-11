package Lesson11_01_2024;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 7, 4, 2, 4, 5, 8};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
                System.out.println(Arrays.toString(arr));

            }


        }

    }
    static void swap(int[] arr, int i, int j){ //ссылочный тип
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
