package com.sameer.bootstrapHackathon;

import java.util.Date;

public class OrderEntity {

    private String customerId;
    private String manufactureId;
    private String societyId;
    private String cityId;
    private String routeId;
    private String storeId;
    private String orderId;
    private Date orderDate;
    private String categoryId;
    private String subCategoryId;
    private String productId;
    private Integer productQty;
    private Double sellingPricePerItem;
    private Double totalCost;
    private Integer subscription;
    private Date productToBasketDate;
    private boolean deliveredByCustomer;

    private Double costOfDelivery;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getManufactureId() {
        return manufactureId;
    }

    public void setManufactureId(String manufactureId) {
        this.manufactureId = manufactureId;
    }

    public String getSocietyId() {
        return societyId;
    }

    public void setSocietyId(String societyId) {
        this.societyId = societyId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(String subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getProductQty() {
        return productQty;
    }

    public void setProductQty(Integer productQty) {
        this.productQty = productQty;
    }

    public Double getSellingPricePerItem() {
        return sellingPricePerItem;
    }

    public void setSellingPricePerItem(Double sellingPricePerItem) {
        this.sellingPricePerItem = sellingPricePerItem;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Integer getSubscription() {
        return subscription;
    }

    public void setSubscription(Integer subscription) {
        this.subscription = subscription;
    }

    public Date getProductToBasketDate() {
        return productToBasketDate;
    }

    public void setProductToBasketDate(Date productToBasketDate) {
        this.productToBasketDate = productToBasketDate;
    }

    public boolean isDeliveredByCustomer() {
        return deliveredByCustomer;
    }

    public void setDeliveredByCustomer(boolean deliveredByCustomer) {
        this.deliveredByCustomer = deliveredByCustomer;
    }

    public Double getCostOfDelivery() {
        return costOfDelivery;
    }

    public void setCostOfDelivery(Double costOfDelivery) {
        this.costOfDelivery = costOfDelivery;
    }
}
