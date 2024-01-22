package Lesson22_01_2024;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpressions {
    public static void main(String[] args) {
        //1 long method
        Pattern pattern = Pattern.compile("\\w\\s");
        Matcher matcher = pattern.matcher("a ");
        boolean b = matcher.matches();
        System.out.println(b);

        //2 chaining
        boolean b2 = Pattern
                .compile("\\w\\s")
                .matcher("a ")
                .matches();
        System.out.println(b2);

        //3 the shortest one
        boolean b3 = Pattern.matches("\\w\\s", "a ");
        System.out.println(b3);

        check("\\w\\s", "a ", "a1");

        //Строка содержит только один символ
        check(".", "a ", "a1");

        //Строка содержит одну или более букву "a", а за ней одну букву "b"
        check("[a]+[b]", "aab", "aba");

        //Строка содержит несколько или ни одной буквы "a", а за ней одну букву "b"
        check("a*b", "b", "aabb");

        //Слово состоит из двух букв, первая из которых "a" (но ее может и не быть)
        check("a?[a-zA-Z]", "ab", "a_");

        //Строка начинается на букву "a"
         check("a.*", "Aa", "ab");

        check("[aA].*", "aAb", "ba");

        //Строка заканчивается на букву "a"
        check(".*a", "aba", "ab");

        //Строка заканчивается на "as"
        check(".*as", "abas", "b_a");

        //Строка содержит "as"
        check(".*as.*", "abasgj", "b_sa");

        //Строка не содержит "a"
        check("[^a]*", "gfs", "b_sa");


        //Слово (буквенная строка) содержит букву "a"

        check("[a-zA-Z]*a[a-zA-Z]*", "absgj", "b_sjhg");

        //В строке содержатся цифры
        check(".*\\d+.*", "8fd9", "b_sjhg");


        //Строка содержит только цифры
        check("\\d+", "89", "1b_sjhg");

        //Строка является вещественным числом с фиксированной точкой
        check("[+-]?\\d+\\.?\\d+", "12.2", "b_sjhg");

        //Содержит ни одного или более сочетаний "ab", а затем "c"
        check(".*(ab)*c", "kfdpsabrplc", "b_sjhg");

        //Содержит одно или более сочетаний "ab", а затем "c"
        check(".*(ab)+c", "kfdpsabrplc", "b_sjhg");

        //Проверить написание номера телефона в формате 8(123)-123-45-67
        check("8\\(\\d{3}\\)-\\d{3}-\\d{2}-\\d{2}", "8(123)-320-20-00", "b_sjhg");

        //Строка не должна начинаться с букв a,b
        check("[^ab].*", "kfdpsabrplc", "b_sjhg");

        //Строка является "end."
        check("end.", "end.", "b_sjhg");


    }

    static void check(String regex, String sTrue, String sFalse) {
        boolean bTrue = Pattern.matches(regex, sTrue);
        boolean bFalse = Pattern.matches(regex, sFalse);
        System.out.printf("%b %b%n", bTrue, bFalse); //%n == \n
    }
}
