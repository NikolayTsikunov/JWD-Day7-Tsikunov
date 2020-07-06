package by.tsikunov.day7.locale;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
    public static void main(String[] args) {
        System.out.println("1 - английский\n2 - белорусский\nлюбой - русский");
        char i = 0;
        try {
            i = (char) System.in.read();
        } catch(IOException e) {
            System.out.println("Ошибка при чтении файла.");
        }

        String country = "";
        String language = "";
        switch (i) {
            case '1':
                country = "US";
                language = "EN";
                break;
            case '2':
                country = "BY";
                language = "BE";
                break;
        }
        Locale current = new Locale(language, country);
        ResourceBundle bundle = ResourceBundle.getBundle("property.text", current);
        String str1 = bundle.getString("str1");
        String str2 = bundle.getString("str2");
        System.out.println(str1);
        System.out.println(str2);
    }
}
