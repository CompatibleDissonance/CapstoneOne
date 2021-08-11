package menu;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class MenuSelectTest {
        @Test
    public void test_switch_selection_exists() {

            String input = "2";
            InputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            MenuSelect.addToCart();
        }

        @Test
    public void test_switch_selection_doesnt_exist() {
            String input = "87";
            InputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);
            MenuSelect.addToCart();
    }

}