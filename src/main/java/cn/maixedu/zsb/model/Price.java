package cn.maixedu.zsb.model;

import java.math.BigDecimal;

public class Price {
    private Integer id;

    private BigDecimal price;

    private BigDecimal superprice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSuperprice() {
        return superprice;
    }

    public void setSuperprice(BigDecimal superprice) {
        this.superprice = superprice;
    }
}