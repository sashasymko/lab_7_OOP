package ua.edu.ucu.apps.flowerstore.Delivery;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public void delivery() {
        System.out.println("DHL");
    }
}