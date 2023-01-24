package tddmicroexercises.telemetrysystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TelemetryConnectionTest {

    @Test
    public void checkConnectionSetUp() {
        Connection connection = new TelemetryConnection();
        Assertions.assertFalse(connection.getConnectionStatus());
        connection.connect("Connection details");
        Assertions.assertTrue(connection.getConnectionStatus());
        connection.disconnect();
        Assertions.assertFalse(connection.getConnectionStatus());
    }
}
