package homework;



/**
 * Если необходимо, исправьте данный код
 */
public class Task2 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[8] = 1;
        int d = 0;
        try {
               int catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
        }
        catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

}
