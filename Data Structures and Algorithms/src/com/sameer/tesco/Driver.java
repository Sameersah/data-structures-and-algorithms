package com.sameer.tesco;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Driver {

    public static  void main(String args[]){
        List<DataPoint> dataPointList = new ArrayList<>();

        dataPointList.add(new DataPoint(1,1));
        dataPointList.add(new DataPoint(1,2));
        dataPointList.add(new DataPoint(1,3));
        dataPointList.add(new DataPoint(1,2));
        dataPointList.add(new DataPoint(2,1));
        dataPointList.add(new DataPoint(2,2));
        dataPointList.add(new DataPoint(2,3));
        dataPointList.add(new DataPoint(2,5));
        dataPointList.add(new DataPoint(3,1));
        dataPointList.add(new DataPoint(3,2));
        dataPointList.add(new DataPoint(3,3));
        dataPointList.add(new DataPoint(3,5));
        dataPointList.add(new DataPoint(4,1));
        dataPointList.add(new DataPoint(4,2));
        dataPointList.add(new DataPoint(4,3));
        dataPointList.add(new DataPoint(4,5));
        dataPointList.add(new DataPoint(2,1));
        dataPointList.add(new DataPoint(2,3));
        dataPointList.add(new DataPoint(2,2));
        dataPointList.add(new DataPoint(2,5));
        dataPointList.add(new DataPoint(3,1));
        dataPointList.add(new DataPoint(3,5));
        dataPointList.add(new DataPoint(3,2));
        dataPointList.add(new DataPoint(3,4));

        DataProcessor processor = new DataProcessor();
        Map.Entry<String,Integer> entry = processor.getMostFrequentClickedGroup(dataPointList);

        System.out.println("Key: "+entry.getKey());
        System.out.println("Freq: "+entry.getValue());
    }
}
