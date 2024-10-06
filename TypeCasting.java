
public class TypeCasting {

    public static void main(String[] args) {
        int myInt = 23;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        double myDouble2 = 123.23d;
        int myInt2 = (int) myDouble2;
        System.out.println(myDouble2);
        System.out.println(myInt2);

        int maxScore = 500;
        int userScore = 423;

        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);
    }
}

/*
 * 
 * Widening Casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double

    Narrowing Casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte
 * 
 */
