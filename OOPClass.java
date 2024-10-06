
public class OOPClass {

    int number = 10;
    String fname = "John";
    String lname = "Doe";

    public OOPClass(int number) {
        fname = "Constructor";
        lname = "Called";
        this.number = number;
    }

    static void sayHello() {
        System.out.println("Merhaba!");
    }

    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {

        //first class
        OOPClass oopClass = new OOPClass(3);
        OOPClass oopClass2 = new OOPClass(4);
        System.out.println(oopClass.number);
        System.out.println(oopClass2.number);

        System.out.println(oopClass.fname + " " + oopClass.lname);
        oopClass.sayHello();
        OOPClass.sayHello();

        oopClass.myPublicMethod();
        OOPClass.myStaticMethod();

    }

}
