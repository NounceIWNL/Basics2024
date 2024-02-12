package Lesson12_02_2024;

//Пользователь вводит натуральные числа, пока не введет ноль.
//Программа выводит массив неповторяющихся чисел, введенных пользователем

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(); //HashSet - сортировка не гарантирована
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        while (number != 0) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            hashSet.add(number);
        }
        System.out.println(Arrays.toString(hashSet.toArray()));

        Iterator value = hashSet.iterator();
        int i = 0;
        while (value.hasNext() && i < 3) {
            System.out.println(value.next());
            i++;
        }
        //hashSet.forEach(System.out::println);
    }
}
