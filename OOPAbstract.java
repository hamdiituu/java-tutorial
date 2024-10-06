
abstract class Animal {

    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Cat extends Animal {

    @Override
    public void animalSound() {
        System.out.println("MiavvVvVv");
    }
}

public class OOPAbstract {

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.sleep();
        myCat.animalSound();
    }
}
