package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {

    private FlowerBucket flowerBucket = new FlowerBucket();
    private CactusFlower cactus = new CactusFlower();

    @BeforeEach
    void setUp() {
        int[] color = new int[] {127, 127, 127} ;
        cactus.setPrice(10.0);
        System.out.println(cactus);

        for (int i = 0; i < 10; i++)
            flowerBucket.addFlower(cactus);
    }

    @Test
    void getPrice() {
        assertEquals(100.0, flowerBucket.getPrice());
    }

    @Test
    void addFlower() {
        flowerBucket.addFlower(cactus);
        assertEquals(11, flowerBucket.flowers.size());
    }
}