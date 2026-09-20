import partA.*;
import partB.*;
public class main {
    public static void main(String[]args){
        System.out.println("=== Part A: Factory Method  ===");

        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        System.out.println();

        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();

        System.out.println("=== Part B: Abstract Factory  ===");

        System.out.println("1 order");
        DeliveryFactory landFactory = new LandDeliveryFactory();
        DeliveryClient landClient = new DeliveryClient(landFactory);
        landClient.executeDeliveryProcess();

        System.out.println();

        System.out.println("2 order: Sea Delivery");
        DeliveryFactory seaFactory = new SeaDeliveryFactory();
        DeliveryClient seaClient = new DeliveryClient(seaFactory);
        seaClient.executeDeliveryProcess();
    }
}
