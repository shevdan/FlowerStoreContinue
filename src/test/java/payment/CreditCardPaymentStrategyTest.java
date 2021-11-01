package payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {
    CreditCardPaymentStrategy pay = new CreditCardPaymentStrategy();

    @Test
    void pay() {
        assertEquals("Payment method: credit card. You will pay 10.0", pay.pay(10.0));
    }
}