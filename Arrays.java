
public class Arrays {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] nums = {10, 20, 30, 40};

        System.out.println(cars.length);
        System.out.println(cars[1]);

        cars[1] = "Opel";

        System.out.println(cars[1]);

        for (String car : cars) {
            System.out.println(car);
        }

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};

        //EXAMPLE : ARRAY SUM
        int sum = 0, avg = 0;

        int[] sumNumbers = {1, 23, 4, 56, 4};

        for (int i : sumNumbers) {
            sum += i;
        }

        avg = sum / sumNumbers.length;

        System.out.println(sum);
        System.out.println(avg);

    }
}
