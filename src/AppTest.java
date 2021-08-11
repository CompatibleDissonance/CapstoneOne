import menu.MenuSelect;
import org.junit.jupiter.api.Test;
import paymentUI.CheckOut;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void While_Loop_input_functions() {
        boolean ordering = true;
        while (ordering) {
            String test = "1";
            InputStream in = new ByteArrayInputStream(test.getBytes());
            System.setIn(in);
            System.out.println("Please input the item number you wish to purchase: ");
            MenuSelect.addToCart();
            System.out.println("To Proceed to Checkout type: Yes. Otherwise type: No");
            ordering = false;
        }
    }


    @Test
    public void if_else_checkout_trigger_functions() {
        boolean ordering = true;
        String test = "Yes";
        InputStream in = new ByteArrayInputStream(test.getBytes());
        System.setIn(in);
        if (test.equalsIgnoreCase("Yes")) {
            ordering = false;
        } else if (test.equalsIgnoreCase("No")) {
            // returns to start of while loop.
            System.out.println("Returning to Song select");
        } else {
            System.out.println("Not a valid input");
            System.out.println("Returning to Song select");
        }
    }

    @Test
    public void if_else_skips_checkout_trigger_functions() {
        boolean ordering = true;
        String test = "No";
        InputStream in = new ByteArrayInputStream(test.getBytes());
        System.setIn(in);
        if (test.equalsIgnoreCase("Yes")) {
            ordering = false;
            CheckOut.CheckOut();
        } else if (test.equalsIgnoreCase("No")) {
            // returns to start of while loop.
            System.out.println("Returning to Song select");
        } else {
            System.out.println("Not a valid input");
            System.out.println("Returning to Song select");
        }
    }

    @Test
    public void if_else_wrong_input_functions() {
        boolean ordering = true;
        String test = "10";
        InputStream in = new ByteArrayInputStream(test.getBytes());
        System.setIn(in);
        if (test.equalsIgnoreCase("Yes")) {
            ordering = false;
            CheckOut.CheckOut();
        } else if (test.equalsIgnoreCase("No")) {
            // returns to start of while loop.
            System.out.println("Returning to Song select");
        } else {
            System.out.println("Not a valid input");
            System.out.println("Returning to Song select");
        }
    }
}