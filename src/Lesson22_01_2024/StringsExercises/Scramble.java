package Lesson22_01_2024.StringsExercises;

public class Scramble {
    public static void main(String[] args) {
        String first = "rkwqodl";
        String second = "wworld";
        StringBuilder sb = new StringBuilder(first);
        boolean result = true;
        for (int i = 0; i < second.length(); i++) {
            int index = sb.toString().indexOf(second.charAt(i));
            if (index < 0) result = false;
            else sb.delete(index, index + 1);
        }
        System.out.println(result);
    }
}
