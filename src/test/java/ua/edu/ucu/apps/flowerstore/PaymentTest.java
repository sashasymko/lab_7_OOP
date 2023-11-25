package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.flowerstore.Payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.flowerstore.Payment.PayPalPaymentStrategy;
import ua.edu.ucu.apps.flowerstore.Payment.Payment;

class PaymentTest { 

    private static Payment creditCardPaymentMethod;
    private static Payment payPalPaymentMethod;
    private static final double TRANSACTION_AMOUNT = 100.0;

    @BeforeAll
    static void setupPaymentMethods() {
        creditCardPaymentMethod = new CreditCardPaymentStrategy();
        payPalPaymentMethod = new PayPalPaymentStrategy();
    }

    @Test
    void whenPaidByCreditCard() {
        boolean paidByCard = 
        creditCardPaymentMethod.pay(TRANSACTION_AMOUNT);
        assert (paidByCard) : "Payment by credit card failed.";
    }

    @Test
    void whenPaidByPayPal() {
        boolean paidByPayPal =
        payPalPaymentMethod.pay(TRANSACTION_AMOUNT);
        assert (paidByPayPal) : "Payment by PayPal failed.";
    }
}
