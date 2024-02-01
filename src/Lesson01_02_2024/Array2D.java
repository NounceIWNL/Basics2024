package Lesson01_02_2024;

public class Array2D {
    //Двумерные массивы
    private static int numRows = 5;
    private static int numCols = 5;

    public static int[][] arr = new int[numRows][numCols];
    static int index = 0;

    public static void main(String[] args) {
//        oneCircle(0, numRows - 1, 0, numCols - 1);
        oneCircle2();
        System.out.println(arrToStringAligned());
    }

    static void oneCircle2(int firstRow, int lastRow, int firstColumn, int lastColumn) {
        for (int j = firstColumn; j < numCols; j++)
            arr[firstRow][j] = index++;
        for (int i = firstRow+1; i < lastRow; i++)
            arr[i][numCols - 1] = index++;
        for (int j = numCols - 2; j >= firstColumn; j--)
            arr[numRows - 1][j] = index++;
        for (int i = numRows - 1; i >= 1; i--)
            arr[i][firstColumn] = index++;
    }

    public static void oneCircle(int firstRow, int lastRow, int firstColumn, int lastColumn) {
        if ((firstRow > lastRow) || (firstColumn > lastColumn)) return;
        if (firstRow == lastRow) {
            for (int j = firstColumn; j <= lastColumn; j++)
                arr[firstRow][j] = index++;
            //printElement(firstRow,j);
            return;
        }
        if (firstColumn == lastColumn) {
            for (int i = firstRow; i <= lastRow; i++)
                arr[i][firstColumn] = index++;
            //printElement(i,firstColumn);
            return;
        }

        for (int j = firstColumn; j <= lastColumn; j++)
            arr[firstRow][j] = index++;
        //printElement(firstRow,j);
        for (int i = firstRow + 1; i <= lastRow; i++)
            arr[i][lastColumn] = index++;
        //printElement(i,lastColumn);
        for (int j = lastColumn - 1; j >= firstColumn; j--)
            arr[lastRow][j] = index++;
        //printElement(lastRow,j);
        for (int i = lastRow - 1; i > firstRow; i--)
            arr[i][firstColumn] = index++;
        //printElement(i,firstColumn);
        oneCircle(firstRow + 1, firstColumn + 1, i);
    }

    //Преобразовать в строку с выравниванием
    public static String arrToStringAligned() {
        StringBuilder result = new StringBuilder();
        String pad = "     ";
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                String sNumber = Integer.toString(arr[i][j]);
                String sPadded = pad.substring(sNumber.length()) + sNumber;
                if (j == 0) result.append(sNumber);
                else
                    result.append(sPadded);
            }
            result.append("\n");
        }
        return result.toString();
    }
}
