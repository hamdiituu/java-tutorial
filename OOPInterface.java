
public class OOPInterface {

    public static void main(String[] args) {
        var myCat = new Cat();
        myCat.run();
        myCat.sound();
    }
}

interface Animal {

    public void sound();

    public void run();
}

class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Miaav!");
    }

    @Override
    public void run() {
        System.out.println("pıt pıt!");
    }
}
