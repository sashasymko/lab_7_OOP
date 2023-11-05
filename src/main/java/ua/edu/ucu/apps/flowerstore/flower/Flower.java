package ua.edu.ucu.apps.flowerstore.flower;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Flower {
    @Id
    private double price;
    private double sepalLength;
    private FlowerColor color;
}