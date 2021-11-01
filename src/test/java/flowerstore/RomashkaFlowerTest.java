package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomashkaFlowerTest {
    private RomashkaFlower romashka;

    @BeforeEach
    void setUp() {
        romashka = new RomashkaFlower(10.0, 10.0, new int[] {127, 127, 127});
    }

    @Test
    void price() {
        assertEquals(10.0, romashka.getPrice());
    }
}