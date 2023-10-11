package com.example.crypta.Activities.Domain;

import java.util.ArrayList;

public class CryptoWallet {
    private String cryptoName;
    private String cryptoSymbol;
    private Double cryptoPrice;
    private Double cryptoPercent;
    private ArrayList<Integer> lineData;
    private Double propertyAmount;
    private Double propertySize;

    public CryptoWallet(String cryptoName, String cryptoSymbol, Double cryptoPrice, Double cryptoPercent, ArrayList<Integer> lineData, Double propertyAmount, Double propertySize) {
        this.cryptoName = cryptoName;
        this.cryptoSymbol = cryptoSymbol;
        this.cryptoPrice = cryptoPrice;
        this.cryptoPercent = cryptoPercent;
        this.lineData = lineData;
        this.propertyAmount = propertyAmount;
        this.propertySize = propertySize;
    }

    public String getCryptoName() {
        return cryptoName;
    }

    public void setCryptoName(String cryptoName) {
        this.cryptoName = cryptoName;
    }

    public String getCryptoSymbol() {
        return cryptoSymbol;
    }

    public void setCryptoSymbol(String cryptoSymbol) {
        this.cryptoSymbol = cryptoSymbol;
    }

    public Double getCryptoPrice() {
        return cryptoPrice;
    }

    public void setCryptoPrice(Double cryptoPrice) {
        this.cryptoPrice = cryptoPrice;
    }

    public Double getCryptoPercent() {
        return cryptoPercent;
    }

    public void setCryptoPercent(Double cryptoPercent) {
        this.cryptoPercent = cryptoPercent;
    }

    public ArrayList<Integer> getLineData() {
        return lineData;
    }

    public void setLineData(ArrayList<Integer> lineData) {
        this.lineData = lineData;
    }

    public Double getPropertyAmount() {
        return propertyAmount;
    }

    public void setPropertyAmount(Double propertyAmount) {
        this.propertyAmount = propertyAmount;
    }

    public Double getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(Double propertySize) {
        this.propertySize = propertySize;
    }
}

