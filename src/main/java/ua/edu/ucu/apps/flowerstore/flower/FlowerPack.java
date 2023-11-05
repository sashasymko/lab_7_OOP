package ua.edu.ucu.apps.flowerstore.flower;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(final Flower flowerer, final int quantity) {
        this.flower = flowerer;
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.quantity * this.flower.getPrice();
    }
}
