package ua.edu.ucu.apps.flowerstore.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.flowerstore.flower.Flower;
import ua.edu.ucu.apps.flowerstore.flower.FlowerService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    private FlowerService flowerService;
    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }
    @GetMapping("/list")
    public List<Flower> getFlower() {
        return flowerService.getFlower();
    }
    @PostMapping("/add")
    public void addFlower(Flower flower) {
        flowerService.add(flower);
    }
}
