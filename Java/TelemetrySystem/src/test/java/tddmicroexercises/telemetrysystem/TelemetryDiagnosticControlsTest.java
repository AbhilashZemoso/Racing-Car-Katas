package tddmicroexercises.telemetrysystem;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TelemetryDiagnosticControlsTest {

    @Test
    public void CheckTransmission_should_send_a_diagnostic_message_and_receive_a_status_message_response() throws Exception {
        Client telemetryClient = new TelemetryClient();
        Connection telemetryConnection = new TelemetryConnection();
        TelemetryDiagnosticControls controls = new TelemetryDiagnosticControls(telemetryClient, telemetryConnection);
        controls.checkTransmission();
        Assertions.assertFalse(controls.getDiagnosticInfo().isEmpty());
    }
}
