package Lesson11_01_2024;

//поместить в массив все простые трехзначные числа, являющиеся палиндромами

public class Arrays {
    public static void main(String[] args) {
        //определить длину массива
        //ялвляется ли число простым
        //является ли 3ое число палиндромом
//        System.out.println(prime(7));
        //создать массив требуемой длинны
        //заполнить массив


//        System.out.println(Arrays.toString(makeArray(countLength())));


    }

    static boolean prime(int num) {
        if (num < 2)
            return false;
        double s = Math.sqrt(num);
        for (int i = 2; i <= s; i++)
            if (num % i == 0)
                return false;
        return true;
    }

    static int countLength() {
        int count = 0;
        for (int num = 100; num < 1000; num++) {
            if (num / 100 == num % 10 && prime(num)) {
                count++;
            }
        }
        return count;
    }


    public static int[] toString(int[] ints) {
        return ints;

    }
}
