package ua.edu.ucu.apps.flowerstore.flower;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.apps.flowerstore.items.Item;
import ua.edu.ucu.apps.flowerstore.properties.FlowerColor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Getter @Setter @AllArgsConstructor @Entity @Table @NoArgsConstructor
public class Flower extends Item {
    @GeneratedValue @Id
    private int id;
    private double sepalLength;
    private String color;
    protected double price;

    public Flower(FlowerColor color, double sepalLength, double price) {
        setColor(color);
        this.sepalLength = sepalLength;
        this.price = price;
    }

    private void setColor(FlowerColor color) {
        this.color = color.toString();
    }

    @Override
    public double price() {
        return price;
    }


}
