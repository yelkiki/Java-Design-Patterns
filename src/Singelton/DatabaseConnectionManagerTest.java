package Singelton;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.Connection;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionManagerTest {

    private static DatabaseConnectionManager manager;

    @BeforeAll
    public static void setUp() {
        // Initialize the DatabaseConnectionManager instance before tests
        manager = DatabaseConnectionManager.getInstance();
    }

    @Test
    public void testGetInstance() {
        // Test if the singleton instance is not null
        assertNotNull(manager, "DatabaseConnectionManager instance should not be null");
    }

    @Test
    public void testGetConnection() {
        // Test if the connection is established
        Connection connection = manager.getConnection();
        assertNotNull(connection, "Connection should not be null");
    }

    @Test
    public void testCloseConnection() {
        // Test if the connection is closed
        manager.closeConnection();
        Connection connection = manager.getConnection();
        assertNotNull(connection, "Connection should not be null after closing and reopening");
    }

    @AfterAll
    public static void tearDown() {
        // Clean up resources after tests
        manager.closeConnection();
    }
}
