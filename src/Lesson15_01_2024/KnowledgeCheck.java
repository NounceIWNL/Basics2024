package Lesson15_01_2024;

public class KnowledgeCheck {
    public static void main(String[] args) {

        // Вариант №2
        //  Вывести все двухзначные числа,
        //  которые делятся на 2, но не делятся на 4,
        //  но при этом делятся на 2 и на 3 одновременно

        for (int i = 10; i < 100; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 4 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
