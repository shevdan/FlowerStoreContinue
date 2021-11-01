package decorators;

import flowerstore.Item;
import lombok.Getter;
import lombok.ToString;

@ToString
public class ItemDecorator implements Item {
    protected Item item;

    public ItemDecorator(Item item){
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }

    @Override
    public String getDesription() {
        return item.getDesription();
    }
}
