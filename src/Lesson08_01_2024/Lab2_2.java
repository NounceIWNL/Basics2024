package Lesson08_01_2024;

public class Lab2_2 {

    public static void main(String[] args) {
        double x = 0.5;
//        double a = 0.625;
        double sum = 0;
        double correct = Math.sin(x) - Math.cos(x) + 1;
//        double y1 = x * (2 + x) / 2;
//        double y2 = Math.pow(x, 3) * (4 + x) / 24;
        double eps = 1e-5;
        double y = 1;
        int i = 1;
        while (Math.abs(y) > eps) {
            double a = (2 * i + x);
            y *= -x * x / i / (i + 1);
            System.out.println(y);
            sum += a * y;
            i++;
        }

//        System.out.println(y1 - y2);
        System.out.println(correct);

    }
}
