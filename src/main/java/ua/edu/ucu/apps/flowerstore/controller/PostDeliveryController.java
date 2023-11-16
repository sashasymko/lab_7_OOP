package ua.edu.ucu.apps.flowerstore.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/post_delivery")
public class PostDeliveryController {
    @GetMapping
    public String delivered_by() {
        return "Post delivery";
    }
}
