package AbstractFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MobileButtonTest {

    @Test
    public void testRender() {
        Button button = new MobileButton();
        button.render();
        // Ideally, use a mock framework to verify the render method call
        assertTrue(button instanceof MobileButton);
    }
}
