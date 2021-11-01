package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    private PayPalPaymentStrategy pay = new PayPalPaymentStrategy();


    @Test
    void pay() {
        assertEquals("Payment method: PayPal. You will pay 10.0", pay.pay(10.0));
    }
}