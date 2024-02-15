package Lesson15_02_2024;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MobileCodes {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(24, "Белтелеком (Максифон)");
        map.put(25, "life😃");
        map.put(291, "Velcom");
        map.put(292, "МТС");
        map.put(293, "Velcom");
        map.put(294, "Diallog");
        map.put(295, "МТС");
        map.put(296, "Velcom");
        map.put(297, "МТС");
        map.put(298, "МТС");
        map.put(299, "Velcom");
        map.put(33, "МТС");
        map.put(44, "Velcom");

        String phone = "+375336779109";

        Set set = map.entrySet();

        System.out.println(set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            if (phone.indexOf(entry.getKey().toString()) == 4)
                System.out.println(entry.getValue());
        }
        check("\\+?\\d{12}", phone);


    }

    static void check(String regex, String sTrue) {
        boolean bTrue = Pattern.matches(regex, sTrue);
        System.out.printf("%b%n", bTrue); //%n == \n
    }
}
