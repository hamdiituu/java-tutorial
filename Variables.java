
public class Variables {

    public static void main(String[] args) {
        //type variableName = value;
        String myName = "Hamdi";
        System.out.println(myName);

        int myAge = 30;
        System.out.println(myAge);

        int myNumber;
        myNumber = 123;
        System.out.println(myNumber);

        int myNumber2 = 1234;
        System.out.println(myNumber2);
        myNumber2 = 334;
        System.out.println(myNumber2);

        final int myCVC;
        myCVC = 222;
        //myCVC = 333; error!!
        System.out.println(myCVC);

        //Other Types
        float price = 19.23f;
        System.out.println(price + "TL");

        double myNum = 19.99d;
        System.out.println(myNum + "TL");

        char myChar = 'S';
        boolean myBool = true;
        //myChar = "S"; error!! for "" string

        System.out.println(myChar);
        System.out.println(myBool);

        //Multiable Variables
        int x = 2, y = 3, z = 1;
        System.out.println(x + y + z);
        int a = 23, b = 120;
        System.out.println(a + b);
        int k, l, m;
        k = l = m = 50;
        System.out.println(k + l + m);

    }
}


/*
 * String - stores text, such as "Hello". String values are surrounded by double quotes
 * int - stores integers (whole numbers), without decimals, such as 123 or -123
 * float - stores floating point numbers, with decimals, such as 19.99 or -19.99
 * char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
 * boolean - stores values with two states: true or false 
 */

 /**
  * Names can contain letters, digits, underscores, and dollar signs
  *  Names must begin with a letter
  * Names should start with a lowercase letter, and cannot contain whitespace
  * Names can also begin with $ and _
  * Names are case-sensitive ("myVar" and "myvar" are different variables)
  * Reserved words (like Java keywords, such as int or boolean) cannot be used as names 
  */