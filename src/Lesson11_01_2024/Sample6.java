package Lesson11_01_2024;

//Поместить в массив все простые делители числа.

public class Sample6 {
    public static void main(String[] args) {
        int num = 120;
        System.out.println(getCount(num));
        System.out.println(Arrays.toString(makeArray(getCount(num), num)));

    }


    static boolean prime(int num) {
        if (num < 2)
            return false;
        double s = Math.sqrt(num);
        for (int i = 2; i <= s; i++)
            if (num % i == 0 && prime(i))
                return false;
        return true;
    }

    static int getCount(int num){
        int count = 0;
        double s = Math.sqrt(num);
        for (int i = 2; i <= s; i++)
            if (num % i == 0 && prime(i)) count++;
        return count;
    }

    static int[] makeArray(int count, int mainNumber){
        int[] Factors = new int[count];
        int index = 0;
        for (int num = 0; num < mainNumber; num++) {
            if (prime(num) && mainNumber%num==0) {
                Factors[index++] = num;
            }
        }
        return Factors;
    }
}
