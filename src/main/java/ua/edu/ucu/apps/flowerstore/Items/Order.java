
package ua.edu.ucu.apps.flowerstore.items;
import ua.edu.ucu.apps.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.payment.Payment;

import java.util.ArrayList;
public class Order {
    private Payment wayofpayment;
    private Delivery wayofdelivery;

    private final ArrayList<Item> myLst;

    public Order() {
        myLst = new ArrayList<>();
    }
    public void setPaymentMethod(Payment wayofpayment) {
        this.wayofpayment = wayofpayment;
    }
    public void setDeliverStrategy(Delivery wayofdelivery) {
        this.wayofdelivery = wayofdelivery;
    }
    public double countPrice() {
        return myLst.stream().mapToDouble(Item::price).sum();
    }
    public void processingOrder() {
        if (wayofpayment.pay(countPrice())) {
            System.out.println("Payment is done");
            wayofdelivery.delivery();
        }
    }
    public void addItem(Item item) {
        myLst.add(item);
    }
    public void deleteItem(Item item) {
        myLst.remove(item);
    }
}