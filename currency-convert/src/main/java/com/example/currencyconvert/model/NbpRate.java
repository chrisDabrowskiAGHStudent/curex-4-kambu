package com.example.currencyconvert.model;

import java.math.BigDecimal;

public class NbpRate {
    private String no;
    private String effectiveDate;
    private BigDecimal mid;

    // Gettery i settery
    public String getNo() {return no;}
    public void setNo(String no) {this.no = no;}
    public String getEffectiveDate() {return effectiveDate;}
    public void setEffectiveDate(String effectiveDate) {this.effectiveDate = effectiveDate;}
    public BigDecimal getMid() {return mid;}
    public void setMid(BigDecimal mid) {this.mid = mid;}
}
