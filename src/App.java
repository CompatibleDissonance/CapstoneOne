import Product.ProductTemplate;
import Product.Products;
import menu.MenuSelect;
import paymentUI.CheckOut;


import java.awt.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Welcome to the noise hole");
        System.out.println("Menu items include: ");


        for (ProductTemplate productTemplate : Products.productList) {
            productTemplate.printProductInfo();
        }

        Scanner input = new Scanner(System.in);
        Scanner test = new Scanner(System.in);
        var fourAMDream = new String("Checkout");
        boolean toCheckout = input.equals(fourAMDream);
        boolean ordering = true;
        while (ordering) {
            MenuSelect.addToCart();
            if (toCheckout) {
                ordering = false;
                CheckOut.CheckOut();
            } else {
                MenuSelect.addToCart();
            }
        }

    }

}
