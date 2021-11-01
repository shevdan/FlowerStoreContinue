package decorators;

import flowerstore.Item;
import lombok.ToString;

@ToString
public class PaperDecorator extends ItemDecorator{


    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice(){
        return 13 + this.item.getPrice();
    }

    @Override
    public String getDesription() {
        return item.getDesription() + " with paper";
    }
}
