package com.example.currencyconvert.service;

import com.example.currencyconvert.model.NbpRateResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

@Service
public class NBPApiClient {
    private final WebClient client = WebClient.create("http://api.nbp.pl/api");

    public Mono<BigDecimal> getExchangeRate(String currencyCode) {
        return client.get()
                .uri("/exchangerates/rates/A/{code}?format=json", currencyCode)
                .retrieve()
                .bodyToMono(NbpRateResponse.class)
                .map(response -> response.getRates().get(0).getMid());
    }

}
