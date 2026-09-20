package partB;

public class LandDeliveryFactory implements DeliveryFactory {
    @Override
public Vehicle createVehicle() {
    return new TruckVehicle();
}

    @Override
    public Driver createDriver() {
        return new TruckDriver();
    }

}
