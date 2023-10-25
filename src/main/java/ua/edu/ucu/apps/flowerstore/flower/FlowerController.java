package ua.edu.ucu.apps.flowerstore.flower;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {

    @GetMapping("/list")
    public List<Flower> getFlower() {
        return List.of(new Flower(45, 0.8, FlowerColor.RED));
    }
}
