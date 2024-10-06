
import java.util.ArrayList;
import java.util.function.Consumer;

public class OOPLambda {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> {
            System.out.println(n);
        });

        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        numbers.forEach(method);

        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}

interface StringFunction {

    String run(String str);
}

/*
 parameter -> expression

 (parameter1, parameter2) -> expression

 Expressions are limited. They have to immediately return a value, and they cannot contain variables, assignments or statements such as if or for. In order to do more complex operations, a code block can be used with curly braces. If the lambda expression needs to return a value, then the code block should have a return statement.

 (parameter1, parameter2) -> { code block }

 */
