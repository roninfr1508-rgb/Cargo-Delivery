package partB;

public class DeliveryClient {
    private final Vehicle vehicle;
    private final Driver driver;

    public DeliveryClient(DeliveryFactory factory) {
        this.vehicle = factory.createVehicle();
        this.driver = factory.createDriver();
    }

    public void executeDeliveryProcess() {
        driver.operate();
        vehicle.startRoute();
    }
}
