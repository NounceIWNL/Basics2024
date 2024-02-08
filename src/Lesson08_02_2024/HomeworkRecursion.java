package Lesson08_02_2024;

public class HomeworkRecursion {
    static int n = 7;
    static int[] arr = new int[n];

    static StringBuilder sb = new StringBuilder();
    static String[] names = {"борщ", "щи", "пюре", "макароны", "мясо", "чай", "сок"};


    public static void main(String[] args) {
        for (int i = 0; i < 7; i++)
            arr[i] = i;

        combinations(sb, 0);
    }
    private static void combinations(StringBuilder sb, int start) {
        if (sb.length() == 2 && correct2(sb)) {
            int i1 = Integer.parseInt(Character.toString(sb.toString().charAt(0)));
            int i2 = Integer.parseInt(Character.toString(sb.toString().charAt(1)));
            System.out.printf("%s, %s%n", names[i1], names[i2]);
        }
        for (int i = start; i < n; i++) {
            sb.append(Integer.toString(arr[i]));
            combinations(sb, i + 1);
            sb.delete(sb.length() - 1, sb.length());
        }
    }
    private static boolean correct2(StringBuilder sb) {
        if (sb.charAt(0) == '0' && sb.charAt(1) == '1') return false;
        if (sb.charAt(0) == '2' && sb.charAt(1) == '3') return false;
        if (sb.charAt(0) == '3' && sb.charAt(1) == '4') return false;
        if (sb.charAt(0) == '5' && sb.charAt(1) == '6') return false;
        return true;
    }
}
