/*
Заменить каждое второе вхождение строкиНапишите метод, заменяющий в строке
каждое второе вхождение «object-oriented programming» (не учитываем регистр символов)
 на «OOP». Например, строка
"Object-oriented programming is a programming language model organized around objects rather than
"actions" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla."
должна быть преобразована в
"Object-oriented programming is a programming language model organized around objects rather than
"actions" and data rather than logic. OOP blabla. Object-oriented programming bla."
 */
public class Task1 {
    public static String replaceCustom(String str, String oldStr, String newStr) {
        return str.replaceAll("(?i)(" + oldStr + ".*?)" + oldStr, "$1" + newStr);
    }

    public static void main (String [] args) {
        String input = "Object-oriented programming is a programming language model organized around objects rather than 'actions' and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
        System.out.println(replaceCustom(input, "Object-oriented programming", "OOP"));
    }
}

