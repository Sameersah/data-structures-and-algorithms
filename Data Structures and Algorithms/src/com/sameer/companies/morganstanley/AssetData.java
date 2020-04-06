package com.sameer.companies.morganstanley;

import java.util.Date;

public class AssetData {
    String security;
    String assetCategory;
    Date start;
    Date end;

    public AssetData(){}
    public AssetData(String security,String assetCategory,Date start,Date end){
        this.security = security;
        this.assetCategory = assetCategory;
        this.start = start;
        this.end = end;
    }
}
