package homework;

import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task4 {
public static void inputStr(){
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    if (str.isEmpty()){
        throw new IllegalArgumentException("пустые строки вводить нельзя");
    }else {
        System.out.println(str);
    }

}

    public static void main(String[] args) {
        inputStr();
    }
}
