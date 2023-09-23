package homework;

import java.io.FileNotFoundException;

/**
 * Дан следующий код, исправьте его там, где требуется
 */
public class Task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            if (b == 0) {
                throw new ArithmeticException();
            } else {
                System.out.println(a / b);
            }
        }
        catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
            try{
            printSum(23, 234);
            int[] abc = {1, 2, 3};
            abc[3] = 9;
                for (int i = 0; i < abc.length; i++) {
                    System.out.print(abc[i]+", ");
                }
       }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
       }
    }


    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

}

