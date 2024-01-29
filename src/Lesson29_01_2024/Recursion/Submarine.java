package Lesson29_01_2024.Recursion;

public class Submarine {
    public static void main(String[] args) {
        submarine(0);

    }

    static void submarine(int depth) { //использование аргумента для контроля количества рекурсивных вызовов
        if (depth == 3) return;  //2. выход из рекурсии
        //3. инструкции, полезная работа
        System.out.println("hi " + depth);
        submarine(depth + 1);//4. рекурсивный вызов (погружение)
        System.out.println("hi " + depth);
    }
}
