package delivery;

import flowerstore.CactusFlower;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {

    private PostDeliveryStrategy deliver = new PostDeliveryStrategy();
    private List<Item> items = new ArrayList<>();
    private CactusFlower cactus;




    @BeforeEach
    void setUp() {
        int[] color = new int[] {127, 127, 127} ;
        cactus = new CactusFlower();
        cactus.setColor(color);
        cactus.setPrice(10.0);
        items.add(cactus);
    }

    @Test
    void delivery() {
        assertEquals("Your order is: CactusFlower(price=10.0, sepalLength=0.0, color=[127, 127, 127], "
                + "flowertype=CACTUS)\nOrder will be delivered by post.", deliver.delivery(items));
    }
}