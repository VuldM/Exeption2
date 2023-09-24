package homework;

import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Task1{
     public static void getNum(){
          boolean flag = true;
          while (flag) {
               Scanner input = new Scanner(System.in);
         try {
              float num = input.nextFloat();
              System.out.println(num);
               flag = false;

              }
         catch(Exception e){
                   System.out.println("Этот символ не надлежащего вида "+ e.getClass());

              }
         }
     }
}

class Program{
     public static void main(String[] args){
        Task1.getNum();
          System.out.println();
     }
}
