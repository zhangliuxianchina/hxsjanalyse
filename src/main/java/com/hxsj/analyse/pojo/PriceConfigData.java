package com.hxsj.analyse.pojo;

public class PriceConfigData {
    private Integer id;

    private String applyId;

    private String parentType;

    private String productType;

    private String customeName;

    private String customeMobile;

    private String customeEmail;

    private Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getCustomeName() {
        return customeName;
    }

    public void setCustomeName(String customeName) {
        this.customeName = customeName;
    }

    public String getCustomeMobile() {
        return customeMobile;
    }

    public void setCustomeMobile(String customeMobile) {
        this.customeMobile = customeMobile;
    }

    public String getCustomeEmail() {
        return customeEmail;
    }

    public void setCustomeEmail(String customeEmail) {
        this.customeEmail = customeEmail;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}