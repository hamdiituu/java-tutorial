
import java.util.HashMap;
import java.util.Scanner;

public class OOPHashMap {

    public static void main(String[] args) {
        // Fiyatları tutan hashMap
        HashMap<String, Float> prices = new HashMap<String, Float>();

        // Sepet için ürünlerin ekleneceği hashMap (Ürün kodu, Adet)
        HashMap<String, Integer> cart = new HashMap<String, Integer>();

        // Ürün fiyatları
        prices.put("12", 19.9f);
        prices.put("23", 29.9f);
        prices.put("45", 49.9f);
        prices.put("34", 59.9f);
        prices.put("54", 69.9f);
        prices.put("37", 79.9f);

        System.out.println("Ürün Fiyatları: " + prices);

        float totalCart = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Toplam sepet: " + totalCart);
            System.out.println("Ürün barkodu giriniz (veya 'öde', 'çıkar', 'kapat'): ");
            String input = scanner.nextLine();

            if (input.equals("öde")) {
                System.out.println("Toplam sepet: " + totalCart);
                System.out.println("Sepet: " + cart);
                totalCart = 0;
                cart.clear(); // Sepeti boşaltıyoruz
                System.out.println("Ödeme başarılı!");
                continue;
            }

            if (input.equals("kapat")) {
                System.out.println("Toplam sepet: " + totalCart);
                System.out.println("Sepet: " + cart);
                System.out.println("Hesap kapatıldı!");
                continue;
            }

            if (input.equals("çıkar")) {
                System.out.println("Çıkarılacak ürün barkodu: ");
                String removeInput = scanner.nextLine();
                if (cart.containsKey(removeInput)) {
                    int quantity = cart.get(removeInput);
                    totalCart -= prices.get(removeInput) * quantity; // Ürünün toplam fiyatını sepetten çıkar
                    cart.remove(removeInput); // Ürünü sepetten çıkar
                    System.out.println(removeInput + " kodlu ürün sepetten çıkarıldı.");
                } else {
                    System.out.println("Ürün sepetinizde bulunamadı!");
                }
                continue;
            }

            var productPrice = prices.get(input); // Barkod kontrolü

            if (productPrice != null) {
                // Eğer sepetimizde bu ürün varsa, adetini artırıyoruz
                if (cart.containsKey(input)) {
                    int currentQuantity = cart.get(input);
                    cart.put(input, currentQuantity + 1); // Ürünün adedini 1 artır
                } else {
                    // Eğer ürün sepette yoksa, yeni ekliyoruz ve adet 1
                    cart.put(input, 1);
                }

                // Toplam sepete ürün fiyatını ekliyoruz
                totalCart += productPrice;
                System.out.println(input + " kodlu ürün sepete eklendi. (" + cart.get(input) + " adet)");
            } else {
                System.out.println("Ürün bulunamadı!");
            }
        }

    }
}
