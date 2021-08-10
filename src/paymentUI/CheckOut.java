package paymentUI;

import java.util.Scanner;

public class CheckOut {
    public static void CheckOut() {
        Scanner test = new Scanner(System.in);

        String str = test.nextLine();

        System.out.println("please enter your email: ");

        String emailInput = test.next();
        System.out.println("Your order will be delivered to: " + emailInput);

        System.out.println("Please enter the following payment details!");

        System.out.println("Name on card: ");
        String cardName = test.next();

        System.out.println("Card number: ");
        Long cardNumber = test.nextLong();

        System.out.println("Card expiry date: ");
        int cardExpDate = test.nextInt();

        System.out.println("Card security code (3(Three) digits on the back): ");
        int cardSecCode = test.nextInt();

        System.out.println("Thank you for your purchase! please check your email (" + emailInput + ") for your download link!");
    }
}
