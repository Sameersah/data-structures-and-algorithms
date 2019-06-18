package com.sameer.tesco;

import java.util.*;
import java.util.stream.Collectors;

public class DataProcessor {

    public Map.Entry<String,Integer> getMostFrequentClickedGroup(List<DataPoint> dataPointList) {
        Map<Integer, List<Integer>> userClickDataMap = collectUserData(dataPointList);
        Map<String, Integer> productGroupFreqMap = new HashMap<>();
        List<String> keyList;
        for (Map.Entry<Integer, List<Integer>> entry : userClickDataMap.entrySet()) {
            keyList = processEachUserData(entry.getValue());
            for (String key : keyList) {
                if (!productGroupFreqMap.containsKey(key)) {
                    productGroupFreqMap.put(key, 1);
                } else {
                    int freq = productGroupFreqMap.get(key);
                    productGroupFreqMap.put(key, ++freq);

                }
            }

        }

        Map<String, Integer> result =  productGroupFreqMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

       /* for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }*/

       return  result.entrySet().iterator().next();
    }

    private List<String> processEachUserData(List<Integer> productSeqList) {
        List<String> keyList = new ArrayList<String>();
        int i = 0;
        while (i + 2 < productSeqList.size()) {
            String pid1 = String.valueOf(productSeqList.get(i));
            String pid2 = String.valueOf(productSeqList.get(i + 1));
            String pid3 = String.valueOf(productSeqList.get(i + 2));
            String currkey = pid1 + pid2 + pid3;

            keyList.add(currkey);
            i++;
        }

        return keyList;
    }

    private Map<Integer, List<Integer>> collectUserData(List<DataPoint> dataPointList) {
        Map<Integer, List<Integer>> userClickDataMap = new HashMap<>();
        for (DataPoint dataPoint : dataPointList) {
            List<Integer> productList;
            if (!userClickDataMap.containsKey(dataPoint.custId)) {
                productList = new LinkedList<>();
                productList.add(dataPoint.productId);
                userClickDataMap.put(dataPoint.custId, productList);
            } else {
                productList = userClickDataMap.get(dataPoint.custId);
                productList.add(dataPoint.productId);
                //     userClickDataMap.put(dataPoint.custId,productList);
            }
        }
        return userClickDataMap;
    }
}
