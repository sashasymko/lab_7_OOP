package ua.edu.ucu.apps.flowerstore.Items;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public abstract class Item {
    private String description;

    public abstract double price();
}
