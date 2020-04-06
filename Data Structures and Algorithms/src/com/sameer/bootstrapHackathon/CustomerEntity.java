package com.sameer.bootstrapHackathon;

import java.util.List;

public class CustomerEntity {

    private  String customerName;
    private String customerId;
    private Double earning;

    private List<OrderEntity> orderEntityList;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Double getEarning() {
        return earning;
    }

    public void setEarning(Double earning) {
        this.earning = earning;
    }
}
