package ua.edu.ucu.apps.flowerstore.flower;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.apps.flowerstore.Items.Item;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Getter @Setter @AllArgsConstructor @Entity @NoArgsConstructor
public class Flower extends Item {
    @Id
    private int id;
    private double sepalLength;
    private FlowerColor color;
    protected double price;

    public Flower(FlowerColor color, double sepalLength, double price) {
        setColor(color);
        this.sepalLength = sepalLength;
        this.price = price;
    }
    @Override
    public double price() {
        return price;
    }
}
