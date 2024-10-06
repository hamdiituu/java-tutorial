
public class Methods {

    public static void main(String[] args) {
        myMethod();
        sayMyName("Hamdi");
        sayMyName("Elif");
        System.out.println(sum2Number(1, 3));

        //Method overloading
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        int myNum3 = plusMethodInt(8, 5);
        double myNum4 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum3);
        System.out.println("double: " + myNum4);

        //Recursion

        System.out.println(sum(2));
    }

    static void myMethod() {
        System.out.println("myMethod called.");
    }

    static void sayMyName(String name) {
        System.out.println("My name is " + name);
    }

    static int sum2Number(int num1, int num2) {
        return num1 + num2;
    }

    //Method Overloading
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    //Recursion
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}

/**
 *
 * In Java, variables are only accessible inside the region they are created.
 * This is called scope.
 *
 */
