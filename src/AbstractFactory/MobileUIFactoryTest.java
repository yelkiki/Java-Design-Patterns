package AbstractFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MobileUIFactoryTest {

    @Test
    public void testCreateButton() {
        AbstractFactory factory = new MobileUIFactory();
        Button button = factory.createButton();
        assertTrue(button instanceof MobileButton);
    }

    @Test
    public void testCreateTextField() {
        AbstractFactory factory = new MobileUIFactory();
        TextField textField = factory.createTextField();
        assertTrue(textField instanceof MobileTextField);
    }
}
