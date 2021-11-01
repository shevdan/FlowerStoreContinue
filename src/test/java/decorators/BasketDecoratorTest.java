package decorators;

import flowerstore.CactusFlower;
import flowerstore.Flower;
import flowerstore.FlowerBucket;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {

    private CactusFlower cactus;
    private Item bucket = new FlowerBucket();

    @BeforeEach
    void setUp() {
        int[] color = new int[] {127, 127, 127} ;
        cactus = new CactusFlower(10.0, 10.0, color);
        ((FlowerBucket) bucket).addFlower((Flower) cactus);
        bucket = new BasketDecorator(bucket);

    }

    @Test
    void getPrice() {
        assertEquals(14.0, bucket.getPrice());
    }

    @Test
    void getDesription() {
        assertEquals("FlowerBucket(flowers=[CactusFlower(price=10.0, "
                + "sepalLength=10.0, color=[127, 127, 127], flowertype=CACTUS)]) with basket", bucket.getDesription());
    }

}