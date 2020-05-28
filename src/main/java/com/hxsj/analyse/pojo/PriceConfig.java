package com.hxsj.analyse.pojo;

public class PriceConfig {
    private Integer id;

    private String parentType;

    private String parentTypeDesc;

    private String productType;

    private String productTypeDesc;

    private Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public String getParentTypeDesc() {
        return parentTypeDesc;
    }

    public void setParentTypeDesc(String parentTypeDesc) {
        this.parentTypeDesc = parentTypeDesc;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductTypeDesc() {
        return productTypeDesc;
    }

    public void setProductTypeDesc(String productTypeDesc) {
        this.productTypeDesc = productTypeDesc;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}