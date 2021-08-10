package Product;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Products {
    public static ProductTemplate Glitches = new ProductTemplate(22.50, "Glitches");
    public static ProductTemplate NYCompression = new ProductTemplate(25.40, "NYCompression");
    public static ProductTemplate BadMood = new ProductTemplate(23.50, "BadMood");
    public static ProductTemplate Sleuth = new ProductTemplate(15, "Sleuth");


    public static List<ProductTemplate> productList = new ArrayList<>(List.of(
            Glitches, NYCompression, BadMood, Sleuth
    ));
}
