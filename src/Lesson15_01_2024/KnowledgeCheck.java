package Lesson15_01_2024;

public class KnowledgeCheck {
    public static void main(String[] args) {

        for (int i = 10; i < 100; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 4 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
