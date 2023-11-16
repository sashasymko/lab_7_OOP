package ua.edu.ucu.apps.flowerstore.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/payment_paypal")
public class PayPalController {
    @GetMapping
    public String payment_by_()
    {
        return "Paypal";
    }
}
