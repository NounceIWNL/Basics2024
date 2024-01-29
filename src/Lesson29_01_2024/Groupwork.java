package Lesson29_01_2024;

public class Groupwork {
    public static void main(String[] args) {
        int n = 5;
        int s;
        StringBuilder sb = new StringBuilder();
        sb.append(n);

        for (int i = 0; i < 5; i++) {
            String x = sb.toString();
            s = Integer.parseInt(x);
            sb.append(n);
            s = n * s;
            System.out.println(s);
        }
    }
}