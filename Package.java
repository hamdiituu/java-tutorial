
import custom.Slugger;
import java.util.Scanner;

public class Package {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter article title : ");

        String title = scanner.nextLine();
        System.out.println("Slug : " + Slugger.toSlug(title));
    }
}
