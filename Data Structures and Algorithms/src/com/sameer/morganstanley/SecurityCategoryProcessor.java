package com.sameer.morganstanley;


import java.util.*;

public class SecurityCategoryProcessor {

    Map<String, List<DateRange>> securityStartMap ;
    Map<String, String> categoryMap ;

      public SecurityCategoryProcessor(List<AssetData> assetDataList){
          securityStartMap = new HashMap<>();
          categoryMap = new HashMap<>();

          populateData(assetDataList);

      }

      private void populateData(List<AssetData> assetDataList){
          for(AssetData data:assetDataList){

              String security = data.security;
              List<DateRange> dateRangeList;
              if(!securityStartMap.containsKey(security)){
                  dateRangeList = new ArrayList<>();
                  DateRange range = new DateRange();
                  range.startDate = data.start;
                  range.endDate = data.end;
                  dateRangeList.add(range);
                  securityStartMap.put(security,dateRangeList);
              }else{
                  dateRangeList = securityStartMap.get(security);
                  DateRange range = new DateRange();
                  range.startDate = data.start;
                  range.endDate = data.end;
                  dateRangeList.add(range);
              }

              String categoryMapKey = security+data.start.toString();

              categoryMap.put(categoryMapKey,data.assetCategory);

          }
      }

      public String fetchAssetCategory(String security, Date date){
          String assetCategory = null;
          List<DateRange> dateRangeList = securityStartMap.get(security);
          Date startDate = null;
          for(DateRange range: dateRangeList){

              if(date.after(range.startDate)  && date.before(range.endDate) || date.toString().equals(range.startDate.toString()) || date.toString().equals(range.endDate.toString())){
                  startDate = range.startDate;
                  break;

              }
          }

          if(startDate!= null){
              assetCategory = categoryMap.get(security+startDate.toString());
          }
          return  assetCategory;
      }



      public boolean validateSecurity(String security, String assetCategory, Date date){
          List<DateRange> dateRangeList = securityStartMap.get(security);
          if(dateRangeList == null){
              return false;
          }

          boolean dateFoundinRange =false;
          Date startDate = new Date();
          for(DateRange range:  dateRangeList){
              if(date.after(range.startDate)  && date.before(range.endDate) || date.toString().equals(range.startDate.toString()) || date.toString().equals(range.endDate.toString())){
                  startDate = range.startDate;
              }
                  dateFoundinRange = true;
                  break;
              }

              if(!dateFoundinRange){
                  return  false;
              }

              String categoryMapKey  = security+startDate.toString();

              String assetCategoryFromMap  = categoryMap.get(categoryMapKey);
               if(assetCategoryFromMap ==null || !assetCategoryFromMap.equals(assetCategory)){
                   return  false;
               }
               return  true;

      }

}
