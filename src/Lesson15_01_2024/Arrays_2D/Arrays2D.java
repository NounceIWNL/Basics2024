package Lesson15_01_2024.Arrays_2D;

import java.util.Arrays;

public class Arrays2D {
    static int[][] arr;
    static int rows = 7;
    static int cols = 5;

    public static void main(String[] args) {
        arr = new int[rows][cols];
        fillOrder();
        //fillOrderUD();
        //fillSnake();
        print();
        travel();
//System.out.println(Arrays.deepToString(arr));
    }

    static void print() {
        for (int i = 0; i < rows; i++)
            System.out.println(Arrays.toString(arr[i]));
    }

    static void fillOrder() {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[i][j] = j + 1 + i * cols;
    }

    static void fillOrderUD() {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[i][j] = i + 1 + j * rows;
    }

    static void fillSnake() {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (i % 2 == 0)
                    arr[i][j] = j + 1 + i * cols;
                else
                    arr[i][j] = cols - j + i * cols;
    }

    //Проход по массиву: SE,S,SE,S...

    static void travel() {
        int i = 0;
        int j = 0;
        while (i < rows && j < cols) {
            System.out.println(arr[i][j] + " ");
            i++;
            j++;
            if (i < rows && j < cols)
                System.out.println(arr[i][j] + " ");
            else break;
            i++;
            if (i < rows && j < cols)
            System.out.println(arr[i][i] + " ");
            else break;
        }
        System.out.print(" ");
    }
}

