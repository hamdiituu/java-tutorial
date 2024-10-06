
abstract class Main {

    public String fname = "John";
    public int age = 24;

    public abstract void study(); // abstract method
}

class Student extends Main {

    public int graduationYear = 2018;

    public void study() {
        System.out.println("Studying all day long");
    }
}

public class OOPModifiers {

    final int buildNumber = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        OOPModifiers modifiers = new OOPModifiers();
        // modifiers.buildNumber = 11; // ERROR : cannot assign a value to final variable buildNumber
        System.out.println(modifiers.buildNumber);
    }
}


/*

public	The code is accessible for all classes	
private	The code is only accessible within the declared class	
default	The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter	
protected	The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter


final	The class cannot be inherited by other classes (You will learn more about inheritance in the Inheritance chapter)	
abstract	The class cannot be used to create objects (To access an abstract class, it must be inherited from another class. You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters)


final	Attributes and methods cannot be overridden/modified
static	Attributes and methods belongs to the class, rather than an object
abstract	Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters
transient	Attributes and methods are skipped when serializing the object containing them
synchronized	Methods can only be accessed by one thread at a time
vol
atile	The value of an attribute is not cached thread-locally, and is always read from the "main memory"
 */
