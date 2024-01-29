package Lesson29_01_2024.Recursion;

public class Recursion {

    static int index = 0;

    public static void main(String[] args) {
//        recurse();               //1. точка входа в рекурсию
//        recurse(0);
        System.out.println(sum(0));
        System.out.println(sum2(0));
    }

    static void recurse() {
        if (index == 5) return;  //2. выход из рекурсии
        index++;                 //3. инструкции, полезная работа
        System.out.println("hi");
        recurse();               //4. рекурсивный вызов (погружение)
    }

    static void recurse(int index) { //использование аргумента для контроля количества рекурсивных вызовов
        if (index == 5) return;  //2. выход из рекурсии
        System.out.println("hi");//3. инструкции, полезная работа
        recurse(index + 1);//4. рекурсивный вызов (погружение)
    }

    static int sum(int number) {
        if (number == 0) return 0;
        return number + sum(number - 1);

    }

    static int sum2(int i) {
        if (i == 1) return i;
        return i + sum2(--i);
    }
}
