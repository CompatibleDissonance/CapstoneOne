package Product;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
// constructed products.


public class Products {
    public static ProductTemplate Glitches = new ProductTemplate(22.50, "Glitches", "1");
    public static ProductTemplate NYCompression = new ProductTemplate(25.40, "NYCompression", "2");
    public static ProductTemplate BadMood = new ProductTemplate(23.50, "BadMood", "3");
    public static ProductTemplate Sleuth = new ProductTemplate(15, "Sleuth", "4");

    // ArrayList of products.
    public static List<ProductTemplate> productList = new ArrayList<>(List.of(
            Glitches, NYCompression, BadMood, Sleuth
    ));



}
