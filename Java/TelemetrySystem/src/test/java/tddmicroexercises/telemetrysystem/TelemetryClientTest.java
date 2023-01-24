package tddmicroexercises.telemetrysystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TelemetryClientTest {

    @Test
    public void checkClientSendReceive() {
        Client client = new TelemetryClient();
        client.send("message");
        Assertions.assertFalse(client.receive().isEmpty());
    }
}
