package com.example.currencyconvert.controller;
import com.example.currencyconvert.service.ExchangeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ExchangeController {
    private final ExchangeService service;

    public ExchangeController(ExchangeService service) {
        this.service = service;
    }

    @GetMapping("/currencies")
    public List<String> getCurrencies() {
        return service.getAvailableCurrencies();
    }

    @GetMapping("/convert")
    public double convert(@RequestParam String from,
                          @RequestParam String to,
                          @RequestParam double amount) {
        return service.convert(from, to, amount);
    }
}
