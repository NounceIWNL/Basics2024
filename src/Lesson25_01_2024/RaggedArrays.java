package Lesson25_01_2024;

import java.util.Arrays;


//ragged, jagged
public class RaggedArrays {
    public static void main(String[] args) {
//        int[][] arr = {{1,2,3}, {1,2}, {1}};

//        System.out.println(Arrays.deepToString(arr));

        String s = "JaggedEdge";
        //{J}; {j,a}; {J,a,q}

        char[][] arr = new char[s.length()][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new char[i + 1];
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
