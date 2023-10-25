package ua.edu.ucu.apps.flowerstore.Payment;
import lombok.Getter;
@Getter
public class PayPalPaymentStrategy implements Payment {
    private final String name;
    public PayPalPaymentStrategy() {
        name = "PayPal";
    }
    @Override
    public boolean pay(double price) {
        System.out.println("you paid with PayPal");
        return true;
    }
}
