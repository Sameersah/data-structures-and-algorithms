package com.sameer.tesco;

public class DataPoint {

    public DataPoint(){

    }

    public DataPoint(int custId, int productId){
        this.custId = custId;
        this.productId = productId;
    }

    Integer custId;
    Integer productId;
}
