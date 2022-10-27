package com.miguel.CoinPrice.API;

public class Coin {
    private String created_on;
    private String unix_time;
    private String expiration_time_unix;
    private Ticker ticker;
    private Market market;
    private String rate;
    private String rate_id;

    public Coin() {
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    public String getUnix_time() {
        return unix_time;
    }

    public void setUnix_time(String unix_time) {
        this.unix_time = unix_time;
    }

    public String getExpiration_time_unix() {
        return expiration_time_unix;
    }

    public void setExpiration_time_unix(String expiration_time_unix) {
        this.expiration_time_unix = expiration_time_unix;
    }

    public Ticker getTicker() {
        return ticker;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getRate_id() {
        return rate_id;
    }

    public void setRate_id(String rate_id) {
        this.rate_id = rate_id;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "created_on='" + created_on + '\'' +
                ", unix_time='" + unix_time + '\'' +
                ", expiration_time_unix='" + expiration_time_unix + '\'' +
                ", ticker=" + ticker +
                ", market=" + market +
                ", rate='" + rate + '\'' +
                ", rate_id='" + rate_id + '\'' +
                '}';
    }
}
