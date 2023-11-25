package ua.edu.ucu.apps.flowerstore.Items;
import ua.edu.ucu.apps.flowerstore.Delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.Payment.Payment;

import java.util.ArrayList;
public class Order {
    private Payment payment;
    private Delivery delivery;

    private final ArrayList<Item> myLst;

    public Order() {
        myLst = new ArrayList<>();
    }
    public void setPaymentMethod(Payment chosenPayment) {
        this.payment = chosenPayment;
    }
    public void setDeliverStrategy(Delivery chosenDelivery) {
        this.delivery = chosenDelivery;
    }
    public double countPrice() {
        return myLst.stream().mapToDouble(Item::price).sum();
    }
    public void processingOrder() {
        if (payment.pay(countPrice())) {
            System.out.println("Payment is done");
            delivery.delivery();
        }
    }
    public void addItem(Item item) {
        myLst.add(item);
    }
    public void deleteItem(Item item) {
        myLst.remove(item);
    }
}
