package AbstractFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DesktopButtonTest {

    @Test
    public void testRender() {
        Button button = new DesktopButton();
        button.render();
        // Ideally, use a mock framework to verify the render method call
        assertTrue(button instanceof DesktopButton);
    }
}
