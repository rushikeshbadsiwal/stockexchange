package com.testproject.model;

import javax.validation.constraints.NotNull;

public class StockDetail {
    @NotNull
    String symbol;
    @NotNull
    Long count;
    @NotNull
    long price;

    public StockDetail(String symbol, Long count, long price) {
        this.symbol = symbol;
        this.count = count;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getHashCode(){
        return symbol.hashCode();
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
