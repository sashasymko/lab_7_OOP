package ua.edu.ucu.apps.flowerstore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.flowerstore.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.flowerstore.payment.PayPalPaymentStrategy;
import ua.edu.ucu.apps.flowerstore.payment.Payment;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PaymentStrategyTests {

    private static Payment creditCardPaymentMethod;
    private static Payment payPalPaymentMethod;
    private static final double TRANSACTION_AMOUNT = 100.0;

    @BeforeAll
    static void setupPaymentMethods() {
        creditCardPaymentMethod = new CreditCardPaymentStrategy();
        payPalPaymentMethod = new PayPalPaymentStrategy();
    }

    @Test
    void whenPaidByCreditCard_thenSuccessful() {
        assertTrue(creditCardPaymentMethod.pay(TRANSACTION_AMOUNT), "Payment by credit card failed.");
    }

    @Test
    void whenPaidByPayPal_thenSuccessful() {
        assertTrue(payPalPaymentMethod.pay(TRANSACTION_AMOUNT), "Payment by PayPal failed.");
    }
}
