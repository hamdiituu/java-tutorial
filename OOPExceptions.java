
public class OOPExceptions {

    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            //System.out.println(myNumbers[10]); // error!
            int age = 12;
            if (age < 18) {
                throw new ArithmeticException("Access denied - You must be at least 18 years old.");
            } else {
               
                System.out.println("Access granted - You are old enough!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}

/*
The try statement allows you to define a block of code to be tested for errors while it is being executed.

The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
 */
