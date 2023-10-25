
package ua.edu.ucu.apps.flowerstore.Items;
import ua.edu.ucu.apps.flowerstore.Payment.Payment;
import ua.edu.ucu.apps.flowerstore.Delivery.Delivery;
import java.util.ArrayList;
public class Order {
    private Payment payment;
    private Delivery delivery;

    private final ArrayList<Item> my_lst;

    public Order() {
        my_lst = new ArrayList<>();
    }
    public void setPaymentMethod(Payment payment) {
        this.payment = payment;
    }
    public void setDeliverStrategy(Delivery delivery) {
        this.delivery = delivery;
    }
    public double CountPrice() {
        return my_lst.stream().mapToDouble(Item::price).sum();
    }
    public void processingOrder() {
        if (payment.pay(CountPrice())) {
            System.out.println("Payment is done");
            delivery.delivery();
        }
    }
    public void addItem(Item item) {
        my_lst.add(item);
    }
    public void deleteItem(Item item) {
        my_lst.remove(item);
    }
}