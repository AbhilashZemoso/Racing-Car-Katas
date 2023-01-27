package tddmicroexercises.telemetrysystem;

public interface Client {
    void send(String message);

    String receive();
}
