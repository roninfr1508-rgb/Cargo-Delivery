package partB;

public class SeaDeliveryFactory implements DeliveryFactory {
    @Override
    public Vehicle createVehicle() {
        return new ShipVehicle();
    }
    @Override
    public Driver createDriver() {
        return new ShipCapitan();
    }
}
