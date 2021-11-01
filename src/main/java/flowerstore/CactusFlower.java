package flowerstore;


import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@ToString @Setter
public class CactusFlower extends Flower{
    private double price;
    private double sepalLength;
    private int[] color;
    private FlowerType flowertype;

    public CactusFlower(){
        setFlowertype(FlowerType.CACTUS);
    }

    public CactusFlower(double price, double sepLen, int[] col){
        setColor(col);
        setPrice(price);
        setSepalLength(sepLen);
        setFlowertype(FlowerType.CACTUS);
    }
    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length );
    }

    public double getPrice(){
        return this.price;
    }
}
