package ua.edu.ucu.apps.flowerstore.Payment;
import lombok.Getter;
@Getter
public class CreditCardPaymentStrategy implements Payment {
    private final String name;
    public CreditCardPaymentStrategy() {
        name = "CreditCard";
    }
    @Override
    public boolean pay(double price) {
        System.out.println("you paid with creditcard");
        return true;
    }
}