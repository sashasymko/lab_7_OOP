package ua.edu.ucu.apps.flowerstore.delivery;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public void delivery() {
        System.out.println("post delivery");
    }
}