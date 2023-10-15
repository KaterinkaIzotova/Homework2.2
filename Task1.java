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
    public static void main (String [] args) {

        String input = "Object-oriented programming is a programming language model organized around objects rather than 'actions' and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
        String input2 = input.toLowerCase();

        int index1 = input2.indexOf("object-oriented programming");
        int index2 = input2.indexOf("object-oriented programming", index1+1);

        String str1 = input.substring(index1,index2);
        String str2 = input.substring(index2);

        String str3 = str2.toLowerCase();
        String str4 = str3.replaceAll("object-oriented programming", "OOP");

        System.out.println(str1+str4);
    }
}