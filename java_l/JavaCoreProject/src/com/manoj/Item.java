package com.manoj;

import java.math.BigDecimal;

public class Item {
    private String name;
    private int quantity;
    private BigDecimal price;

    public Item(String name, int quantity, BigDecimal bigDecimal) {
        this.name = name;
        this.quantity = quantity;
        this.price = bigDecimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


}
