/*
Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака.
Например, если дана строка "string"  результат будет "ri", для строки "code" результат "od",
 для "Practice" результат "ct".
 */
import java.lang.String;
public class Task2 {
    public static void main(String[] args) {
        String str = "MonOPoly";
        String str2 = "";
        int start = (str.length()/2)-1;
        int end = start+2;

        str2 = str.substring(start, end);
        System.out.println(str2);

    }
}
