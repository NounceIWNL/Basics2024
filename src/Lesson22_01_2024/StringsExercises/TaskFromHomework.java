package Lesson22_01_2024.StringsExercises;

//Проверить, можно ли из символов одной строки собрать путем их перестановки другую строку
//Пример: rkqodlw -> world

public class TaskFromHomework {
    public static void main(String[] args) {
        //поиск совпадения буквы из "таргета" в данном слове и добавление его в результат
        String givenWord = "программа";
        String target1 = "мрамор";
        String target2 = "грамм";

        char[] wordArr = givenWord.toCharArray();
        char[] target1Arr = target1.toCharArray();
        StringBuilder sb = new StringBuilder();

        //брейк, чтобы не было повторных сопадений
        for (char ch : target1Arr) {
            for (char letter : wordArr) {
                if (ch == letter) {
                    sb.append(ch);
                    break;
                }
            }
        }
        String result = sb.toString();
        System.out.println(result);

        char[] target2Arr = target2.toCharArray();
        /*
        Эффективно или нет, но решил, вместо добавления новой
        переменной, очистить билдер и использовать его повторно
         */
        sb.delete(0, sb.length());

        for (char ch : target2Arr) {
            for (char letter : wordArr) {
                if (ch == letter) {
                    sb.append(ch);
                    break;
                }
            }
        }
        result = sb.toString();
        System.out.println(result);

    }
}
