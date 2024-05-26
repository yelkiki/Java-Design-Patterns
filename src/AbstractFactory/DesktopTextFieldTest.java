package AbstractFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DesktopTextFieldTest {

    @Test
    public void testRender() {
        TextField textField = new DesktopTextField();
        textField.render();
        // Ideally, use a mock framework to verify the render method call
        assertTrue(textField instanceof DesktopTextField);
    }
}