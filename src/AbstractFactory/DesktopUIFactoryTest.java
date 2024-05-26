package AbstractFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DesktopUIFactoryTest {

    @Test
    public void testCreateButton() {
        AbstractFactory factory = new DesktopUIFactory();
        Button button = factory.createButton();
        assertTrue(button instanceof DesktopButton);
    }

    @Test
    public void testCreateTextField() {
        AbstractFactory factory = new DesktopUIFactory();
        TextField textField = factory.createTextField();
        assertTrue(textField instanceof DesktopTextField);
    }
}
