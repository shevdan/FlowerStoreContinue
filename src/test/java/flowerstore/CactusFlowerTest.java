package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CactusFlowerTest {
    private CactusFlower cactus;

    @BeforeEach
    void setUp() {
        int[] color = new int[] {127, 127, 127};
        cactus = new CactusFlower(10.0, 10.0, color);

    }

    @Test
    void price() {
        assertEquals(10.0, cactus.getPrice());
    }
}