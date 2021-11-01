import decorators.PaperDecorator;
import decorators.RibbonDecorator;
import flowerstore.*;

public class Main1 {
    public static void main(String[] args) {
        Flower flower = new Flower(1.0, 1.0, new int[] {127, 0, 0}, FlowerType.TULIP);

        Item bucket = new FlowerBucket();
        ((FlowerBucket) bucket).addFlower(flower);
        FlowerBucket bucket2 = new FlowerBucket();

//        bucket2.addFlower(flower);
//
//        System.out.println(bucket2.getDesription());
//
//        bucket = bucket2;


        bucket = new PaperDecorator(bucket);
        System.out.println(bucket.getPrice());
        bucket = new RibbonDecorator(bucket);
        System.out.println(bucket.getPrice());
        System.out.println(bucket.getDesription());

    }
}
