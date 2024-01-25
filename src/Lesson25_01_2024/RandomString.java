package Lesson25_01_2024;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.regex.Pattern;

/*
Write a program in Java that generates
a random string with one uppercase letter,
lowercase letters, one or more digits,
and one special sign
 */

public class RandomString {
    private static final String UPPER_CASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_SIGN = "!@#$%^&*()";

    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        sb.append((char) (random.nextInt(25) + 66));

        sb.append(UPPER_CASE_CHARS.charAt(random.nextInt(UPPER_CASE_CHARS.length())));
        sb.append(LOWER_CASE_CHARS.charAt(random.nextInt(LOWER_CASE_CHARS.length())));
        sb.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        sb.append(SPECIAL_SIGN.charAt(random.nextInt(SPECIAL_SIGN.length())));

        //shuffle
        for (int i = 0; i < sb.length(); i++)
            swap(sb, random.nextInt(sb.length()), random.nextInt(sb.length()));
            System.out.println(sb);

    }

    static void swap(StringBuilder sb, int i, int j) {
        char c = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, c);
    }
}
