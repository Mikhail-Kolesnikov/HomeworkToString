import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] expression = string.split(" ");
        String exit = " ";
        for (int i = 0; i < expression.length; i++) {

            System.out.println(expression[i]);
            String first = expression[i].substring(0, 1);
            System.out.println(first);
            exit += first;
            System.out.println(exit);

            int size = first.length();
            String firstLetter = string.substring(0, 1);
            String lastLetter = first.substring(size - 1);
            String sum = firstLetter + lastLetter;
            System.out.println(sum);



        }









//        int index1 = string.indexOf("З");
//        int index2 = string.indexOf("в");
//        int index3 = string.indexOf("т");
//        System.out.println(index1);
//        System.out.println(index2);
//        System.out.println(index3);
//

//        String second = string.substring(4, 5);
//        String third = string.substring(6, 7);
//
//        String result = first + second + third;
//
//        char symbol1 = string.charAt(0);
//        char symbol2 = string.charAt(4);
//        char symbol3 = string.charAt(6);

//

//        System.out.println(symbol1);
//        System.out.println(symbol2);
//        System.out.println(symbol3);
//        System.out.println(result);
//        System.out.println(firstLetter);
//        System.out.println(lastLetter);
//        System.out.println(expression);

    }

}


//1. Пользователь вводит строку через консоль, разделить строку на слова, а также:
//1. Из каждого слова возьмите первую букву и составьте из них строку, в которой содержались бы все первые буквы слов
//2. Напишите на экран размер получившейся строки, а также первую и последнюю буквы слова
