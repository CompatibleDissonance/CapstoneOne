package Product;

public class ProductTemplate {

    public double price;
    public String songName;
    public String number;

    public ProductTemplate(double price, String songName, String number) {
        this.price = price;
        this.songName = songName;
        this.number = number;
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

    public void setNumber(String number) {this.number = number;}

    public String getNumber(){return number;}

    // Prints the product information via the ArrayList in Products and then sent to App main for each loop.
    public void printProductInfo() {
        System.out.println("Selection Number: " + getNumber() + " Song Name: " + this.getSongName() + " " + "Price: $" + this.getPrice() + " AUD");
    }
}

