package homework;

import java.util.ArrayList;

/**
 * Если необходимо, исправьте данный код
 */
public class Task2 {
    public static void main(String[] args) {
        double[] intArray = new double[10];
        intArray[8] =1;
        int d = 0;
        try {
            if(d == 0){
                throw new ArithmeticException("деление на ноль");
            }else {
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

}
