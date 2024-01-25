package Lesson25_01_2024;

import java.util.Arrays;

public class NotBouncingDigits {
    /*
Прыгающие числа: соседние цифры отличаются на 1.
Вывести первые 10 прыгающих чисел (после 100).
 */
    public static void main(String[] args) {

        int[] arr = {100,101,102,103,115,117,200,201,202};

        System.out.println(Arrays.toString(arr));

        if (arr[0]>=100){
            if(Math.abs(arr[0] - arr[1])==1){
                System.out.println(arr[0]);
            }
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > 100) {
                if (Math.abs(arr[i] - arr[i - 1]) == 1 && Math.abs(arr[i] - arr[i + 1]) == 1){
                    System.out.println(arr[i]);
                }

            }

        }

        if (arr[arr.length-1]>=100){
            if(Math.abs(arr[arr.length-1] - arr[arr.length-2])==1){
                System.out.println(arr[arr.length-1]);
            }
        }
    }
}

