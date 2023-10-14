/*
Дана строка “Versions: Java  5, Java 6, Java   7, Java 8, Java 12.”
Найти все подстроки "Java X" и распечатать их.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task4 {
    public static void main (String[] args) {
        String input = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        Pattern pattern = Pattern.compile("Java\s+[0-9]{1,}");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
//
    }
}