package Lesson29_01_2024.Recursion;

public class CombinationsWithoutRepetitions {

    static String s = "123";
    static int n = s.length();

    static int r = 2;

    //1,13,123,12,2,3,23
    public static void main(String[] args) {
        combinations(new StringBuilder(), n, r);

    }

    static void combinations(StringBuilder sb, int n, int r) {
        if (sb.length() == r) {
            System.out.println(sb);
            return;
        }
        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
            combinations(sb, n, r);
            sb.delete(sb.length() - 1, sb.length());
        }
    }
}
