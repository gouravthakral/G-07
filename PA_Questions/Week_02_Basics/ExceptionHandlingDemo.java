package PA_Questions.Week_02_Basics;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        
        try {
            int result = numbers[1] / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("First finally block executed.");
        }

        try {
            int invalidAccess = numbers[5];
            System.out.println("Value: " + invalidAccess);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } finally {
            System.out.println("Second finally block executed.");
        }
    }
}
