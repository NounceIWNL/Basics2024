package Lesson25_01_2024.Libraries;

import com.github.moneytostr.MoneyToStr;
import org.efaps.number2words.Converter;
import org.efaps.number2words.IConverter;
import java.util.Locale;

public class Number2Words {
    public static void main(String[] args) {
        IConverter converter = Converter.getMaleConverter(Locale.ENGLISH);
        String text = converter.convert(2023);
        System.out.println(text);
    }
}
