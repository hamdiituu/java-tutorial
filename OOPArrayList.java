
import java.util.ArrayList;
import java.util.Collections;

public class OOPArrayList {

    public static void main(String[] args) {
        ArrayList<String> brands = new ArrayList<String>();
        brands.add("Volvo");
        brands.add("Seat");
        brands.add("BMW");

        System.out.println(brands);

        for (String brand : brands) {
            System.out.println(brand);
        }

        brands.set(0, "Mercedes");

        System.out.println(brands.get(0));

        brands.remove(1);

        Collections.sort(brands);

        for (String brand : brands) {
            System.out.println(brand);
        }


        brands.clear();

        System.out.println(brands.size());
    }
}
