package Lesson29_01_2024;

public class Previous {

    static int[][] arr;
    public static void main(String[] args) {

//        print(arr);
//        sort(arr);
//        print(arr);

    }



    static void swap(int i, int j){
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    static void sort(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i].length>arr[j].length)
                    swap(i,j);

            }

        }
    }
}
