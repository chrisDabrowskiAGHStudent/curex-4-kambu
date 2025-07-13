package com.example.currencyconvert.model;

import java.util.List;

public class NbpRateResponse {
    private String table;
    private String currency;
    private String code;
    private List<NbpRate> rates;

    // Gettery i settery
    public String getTable() {return table;}
    public void setTable(String table) {this.table = table;}
    public String getCurrency() {return currency;}
    public void setCurrency(String currency) {this.currency = currency;}
    public String getCode() {return code;}
    public void setCode(String code) {this.code = code;}
    public List<NbpRate> getRates() {return rates;}
    public void setRates(List<NbpRate> rates) {this.rates = rates;}
}

