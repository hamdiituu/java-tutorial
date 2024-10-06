
public class Strings {

    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting.length());
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.indexOf("l"));

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        String x = "10";
        String y = "20";
        int k = 30;
        String z = x + y;  // z will be 1020 (a String)
        System.out.println(z);
        String p = k + x;
        System.out.println(p);

        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);

        String txt2 = "The character \\ is called backslash.";
        System.out.println(txt2);

        String txt3 = "It\'s alright.";
        System.out.println(txt3);
    }
}

/*
Escape character	Result	Description
\'	   '	Single quote
\"	   "	Double quote
\\	   \	Backslash
 */

 /*

 \n	New Line	
\r	Carriage Return	
\t	Tab	
\b	Backspace	
\f	Form Feed 


  */