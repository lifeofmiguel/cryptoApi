package com.miguel.CoinPrice.API;

public class Ticker {
    private String ask;
    private String bid;

    public Ticker(String ask, String bid) {
        this.ask = ask;
        this.bid = bid;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "Ticker{" +
                "ask='" + ask + '\'' +
                ", bid='" + bid + '\'' +
                '}';
    }
}
