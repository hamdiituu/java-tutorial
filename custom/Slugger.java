package custom;

import java.text.Normalizer;

public class Slugger {
    public static String toSlug(String input) {
       
        String slug = input.toLowerCase();
        
        slug = slug.replace('ç', 'c')
                   .replace('ğ', 'g')
                   .replace('ı', 'i')
                   .replace('ö', 'o')
                   .replace('ş', 's')
                   .replace('ü', 'u');
        
        slug = Normalizer.normalize(slug, Normalizer.Form.NFD);
        slug = slug.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

        slug = slug.replaceAll("\\s+", "-");

        slug = slug.replaceAll("[^a-z0-9\\-]", "");

        slug = slug.replaceAll("-{2,}", "-");

        slug = slug.replaceAll("^-|-$", "");

        return slug;
    }
}
