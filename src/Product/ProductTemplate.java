package Product;

public class ProductTemplate {

    public double price;
    public String songName;

    public ProductTemplate(double price, String songName) {
        this.price = price;
        this.songName = songName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    // Prints the product information via the ArrayList in Products and then sent to App main for each loop.
    public void printProductInfo() {
        System.out.println("Song Name: " + this.getSongName() + " " + "Price: $" + this.getPrice() + " AUD");
    }
}

