package AbstractFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryCreatorTest {

    @Test
    public void testGetDesktopFactory() {
        AbstractFactory factory = FactoryCreator.getFactory("Desktop");
        assertTrue(factory instanceof DesktopUIFactory);
    }

    @Test
    public void testGetMobileFactory() {
        AbstractFactory factory = FactoryCreator.getFactory("Mobile");
        assertTrue(factory instanceof MobileUIFactory);
    }

    @Test
    public void testGetInvalidFactory() {
        AbstractFactory factory = FactoryCreator.getFactory("Invalid");
        assertNull(factory);
    }
}