package delivery;

import flowerstore.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery{

    @Override
    public String delivery(List<Item> items) {
        String order = "Your order is: ";
        for (int i = 0; i < items.size(); i++){
            order += items.get(i).getDesription() + "\n";
        }
        order += "Order will be delivered by post.";
        return order;
    }
}
