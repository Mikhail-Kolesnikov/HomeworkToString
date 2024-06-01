import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMain {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String string = scanner.nextLine();
        String [] expression= string.split(" ");

        for (int i = 0; i < expression.length; i++) {
            
        }
        System.out.println(Arrays.toString(expression));

//        String first = string.substring(0,1);
//        System.out.println(first);








    }
}



//1. Пользователь вводит строку через консоль, разделить строку на слова, а также:
//1. Из каждого слова возьмите первую букву и составьте из них строку, в которой содержались бы все первые буквы слов
//2. Напишите на экран размер получившейся строки, а также первую и последнюю буквы слова
