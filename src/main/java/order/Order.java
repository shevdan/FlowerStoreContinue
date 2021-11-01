package order;

import delivery.Delivery;
import flowerstore.Item;
import payment.Payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private List<Item> items = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment paymentStrategy){
        this.payment = paymentStrategy;
    }

    public void setDeliveryStrategy(Delivery deliveryStrategy){
        this.delivery = deliveryStrategy;
    }

    public double calculateTotalPrice(){
        double price = 0;
        for (int i = 0; i < items.size(); i++){
            price += items.get(i).getPrice();
        }
        return price;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        for (int i = 0; i < items.size(); i++){
            if (Objects.equals(items.get(i), item))
                items.remove(i);
        }
    }

    public void processOrder(){
        double price = calculateTotalPrice();
        System.out.println("Total price is: " + price);
        System.out.println(payment.pay(price));
        System.out.println(delivery.delivery(items));

    }
}
