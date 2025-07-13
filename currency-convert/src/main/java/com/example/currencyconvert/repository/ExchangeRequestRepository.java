package com.example.currencyconvert.repository;

import com.example.currencyconvert.model.ExchangeRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRequestRepository extends JpaRepository<ExchangeRequest, Long> { }
