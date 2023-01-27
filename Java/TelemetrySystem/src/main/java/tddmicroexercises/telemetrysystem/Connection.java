package tddmicroexercises.telemetrysystem;

public interface Connection {
    boolean getConnectionStatus();

    void connect(String connectionString);

    void disconnect();
}
