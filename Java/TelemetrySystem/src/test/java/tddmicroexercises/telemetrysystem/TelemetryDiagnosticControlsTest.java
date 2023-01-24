package tddmicroexercises.telemetrysystem;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TelemetryDiagnosticControlsTest {

    @Test
    public void CheckTransmission_should_send_a_diagnostic_message_and_receive_a_status_message_response() throws Exception {
        TelemetryDiagnosticControls controls = new TelemetryDiagnosticControls();
        controls.checkTransmission();
        Assertions.assertFalse(controls.getDiagnosticInfo().isEmpty());
    }
}
