package com.sameer.morganstanley;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Driver {

    public static  void main(String args[]){
        List<AssetData> assetDataList = new ArrayList<>();
        AssetData data1 = new AssetData("AAPL","US LARGE CAP VALUE",new Date(2015, 1,1),new Date(2015,2,17));
        AssetData data2 = new AssetData("AAPL","US LARGE CAP GROWTH",new Date(2015,2,18),new Date(2015,3,16));
        AssetData data3 = new AssetData("AAPL","US MID CAP GROWTH",new Date(2015,8,18),new Date(2015,12,15));
        AssetData data4 = new AssetData("AAPL","US MID CAP GROWTH",new Date(2015,8,18),new Date(2015,12,15));


        assetDataList.add(data1);
        assetDataList.add(data2);
       assetDataList.add(data3);
        assetDataList.add(data4);

        SecurityCategoryProcessor processor = new SecurityCategoryProcessor(assetDataList);


        String  assetCategory1 = processor.fetchAssetCategory("CSTO",new Date(2015,1,2));
        System.out.println("AssetCategory: "+assetCategory1);

        String  assetCategory2 = processor.fetchAssetCategory("AAPL",new Date(2015,2,18));
        System.out.println("AssetCategory: "+assetCategory2);

        String  assetCategory3 = processor.fetchAssetCategory("AAPL",new Date(2015,8,18));
        System.out.println("AssetCategory: "+assetCategory3);



        System.out.println("IsValid: "+processor.validateSecurity("AAPL","US LARGE CAP VALUE",new Date(2015,1,2)));
        System.out.println("IsValid: "+processor.validateSecurity("AAPL","US LARGE CAP VALUE",new Date(2016,1,2)));

    }
}
