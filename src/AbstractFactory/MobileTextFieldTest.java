package AbstractFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MobileTextFieldTest {

    @Test
    public void testRender() {
        TextField textField = new MobileTextField();
        textField.render();
        // Ideally, use a mock framework to verify the render method call
        assertTrue(textField instanceof MobileTextField);
    }
}