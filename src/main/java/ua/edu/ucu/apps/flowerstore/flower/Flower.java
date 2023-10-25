package ua.edu.ucu.apps.flowerstore.flower;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Flower {
    private double price;
    private double sepalLength;
    private FlowerColor color;
}