
public class ForLoop {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
                System.out.println(i + " x " + j);
            }
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) { //for each loop

            if (car.equals("BMW")) {
                continue;
            }

            if (car.equals("Mazda")) {
                break;
            }
            System.out.println(car);
        }
    }
}
