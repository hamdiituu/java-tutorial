
public class DoWhileLoop {

    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            i++;
            System.out.println("i : " + i);

        }

        int j = 0;
        do {
            j++;
            System.out.println("j : " + j);

        } while (j < 5);

        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");

    }
}
