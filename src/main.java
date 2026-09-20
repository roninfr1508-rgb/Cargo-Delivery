import partA.*;
public class main {
    public static void main(String[]args){
        System.out.println("=== Тестирование Part A: Factory Method ===");

        // Заказ на наземную доставку
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        System.out.println();

        // Заказ на морскую доставку
        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
    }
}
