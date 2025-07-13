package com.example.currencyconvert.service;

import com.example.currencyconvert.model.ExchangeRequest;
import com.example.currencyconvert.repository.ExchangeRequestRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class ExchangeService {
    private final NBPApiClient nbpApiClient;
    private final ExchangeRequestRepository repository;

    public ExchangeService(NBPApiClient nbpApiClient, ExchangeRequestRepository repository) {
        this.nbpApiClient = nbpApiClient;
        this.repository = repository;
    }

    public List<String> getAvailableCurrencies() {
        return Arrays.asList("PLN", "USD", "EUR", "GBP", "CHF", "CAD", "AUD", "NZD");
    }

    public double convert(String from, String to, double amount) {
        if (from.equals(to)) return amount;

        double fromRate = from.equals("PLN") ? 1.0 : nbpApiClient.getExchangeRate(from).block().doubleValue();
        double toRate = to.equals("PLN") ? 1.0 : nbpApiClient.getExchangeRate(to).block().doubleValue();
        double result = (amount * fromRate) / toRate;

        ExchangeRequest request = new ExchangeRequest();
        request.setFromCurrency(from);
        request.setToCurrency(to);
        request.setAmount(amount);
        request.setResult(result);
        request.setTimestamp(LocalDateTime.now());
        repository.save(request);

        return result;
    }
}
