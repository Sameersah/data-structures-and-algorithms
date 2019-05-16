package com.sameer.interviewQuestions.makeMyTrip;

import java.util.*;

public class Driver {

    private static  Map<AirportNode,List<AirportNode>> airSpaceGraph;
    private static Queue<AirportNode> queue;
    private static Map<String,AirportNode> airPortMap;
    public static void main (String args[]){
        List<FlightData> flightList = getSampleData();

         airSpaceGraph = new LinkedHashMap<>();
         airPortMap = new HashMap<>();
        for(FlightData flight: flightList){

             AirportNode deptNode;
            if(airPortMap.containsKey(flight.getDeptCity())){
                deptNode = airPortMap.get(flight.getDeptCity());
            }else{
                deptNode = new AirportNode();
                deptNode.setAirportName(flight.getDeptCity());
                deptNode.setCurrTime(flight.getDepTim());
                airPortMap.put(flight.getDeptCity(),deptNode);
            }

            AirportNode arrNode;
            if(airPortMap.containsKey(flight.getArrCity())){
                arrNode = airPortMap.get(flight.getArrCity());
            }else{
                arrNode = new AirportNode();
                arrNode.setAirportName(flight.getArrCity());
                arrNode.setCurrTime(flight.getArrtTim());
                airPortMap.put(flight.getArrCity(),arrNode);
            }




            List<AirportNode> arrCityList;

            if(!airSpaceGraph.containsKey(deptNode) ){
     //           System.out.println("key NOT city  found: "+deptNode.getAirportName());
                 arrCityList = new ArrayList<AirportNode>();
                arrCityList.add(arrNode);
                /*for(AirportNode airport: arrCityList){
                             System.out.print(airport.getAirportName()+",");
                }
                System.out.println();*/

            }else{
    //            System.out.println("key city  found: "+deptNode.getAirportName());
                arrCityList = airSpaceGraph.get(deptNode);
                arrCityList.add(arrNode);
                /*for(AirportNode airport: arrCityList){
                    System.out.print(airport.getAirportName()+",");
                }
                System.out.println();*/
            }
            airSpaceGraph.put(deptNode,arrCityList);

        }

        for( Map.Entry<AirportNode,List<AirportNode>> entry: airSpaceGraph.entrySet()){
           System.out.println(entry.getKey().getAirportName()+"->");
            List<AirportNode> list = entry.getValue();
           for(AirportNode airport: list){
               System.out.print(airport.getAirportName()+",");
           }
            System.out.println();

        }

        //logic


         setUnreachableAirports("BOM");
        System.out.println("Reachable/Un-Reachable Airports: ");
        for(Map.Entry<String,AirportNode> entry: airPortMap.entrySet()){
            AirportNode airport = entry.getValue();
            if(airport.isReachableSameDay()){
                System.out.println("Reachable: "+airport.getAirportName());
            }else{
                System.out.println("Un- Reachable: "+airport.getAirportName());
            }
        }
    }

    private static void setUnreachableAirports(String startAirport){
        AirportNode startAirportNode = airPortMap.get(startAirport);
        startAirportNode.setReachableSameDay(true);
        queue = new LinkedList<AirportNode>();
        queue.add(startAirportNode);
        while(!queue.isEmpty()){
            AirportNode curentAirport = queue.poll();
            List<AirportNode> arrNodeList = airSpaceGraph.get(curentAirport);
            if(arrNodeList!= null){
                for(AirportNode node :  arrNodeList){
                    if(node.isVisited() == false || node.isReachableSameDay()==false){
                        if(Integer.valueOf(curentAirport.getCurrTime()) > Integer.valueOf(node.getCurrTime())){
                            node.setReachableSameDay(false);
                        }else{
                            node.setReachableSameDay(true);
                        }
                        node.setReachableSameDay(true);
                        node.setVisited(true);
                        queue.add(node);
                    }

                }
            }

        }
    }

    private static List<FlightData> getSampleData(){
        List<FlightData> flightList = new ArrayList<FlightData>();

        FlightData flight1 = new FlightData();
        flight1.setCarrier("AB");
        flight1.setFlightNo(123);
        flight1.setDeptCity("BLR");
        flight1.setDeptCtry("IN");
        flight1.setArrCity("BOM");
        flight1.setArrCtry("IN");
        flight1.setDepTim("0600");
        flight1.setArrtTim("0900");

        flightList.add(flight1);

        FlightData flight2 = new FlightData();
        flight2.setCarrier("AB");
        flight2.setFlightNo(234);
        flight2.setDeptCity("BLR");
        flight2.setDeptCtry("IN");
        flight2.setArrCity("DEL");
        flight2.setArrCtry("IN");
        flight2.setDepTim("0900");
        flight2.setArrtTim("1200");

        flightList.add(flight2);

        FlightData flight3 = new FlightData();
        flight3.setCarrier("AB");
        flight3.setFlightNo(345);
        flight3.setDeptCity("BOM");
        flight3.setDeptCtry("IN");
        flight3.setArrCity("IXB");
        flight3.setArrCtry("IN");
        flight3.setDepTim("1400");
        flight3.setArrtTim("1700");

        flightList.add(flight3);

        FlightData flight4 = new FlightData();
        flight4.setCarrier("AB");
        flight4.setFlightNo(987);
        flight4.setDeptCity("IXB");
        flight4.setDeptCtry("IN");
        flight4.setArrCity("DEL");
        flight4.setArrCtry("IN");
        flight4.setDepTim("1800");
        flight4.setArrtTim("2100");

        flightList.add(flight4);

        FlightData flight5 = new FlightData();
        flight5.setCarrier("AB");
        flight5.setFlightNo(678);
        flight5.setDeptCity("BOM");
        flight5.setDeptCtry("IN");
        flight5.setArrCity("MAA");
        flight5.setArrCtry("IN");
        flight5.setDepTim("0800");
        flight5.setArrtTim("1000");

        flightList.add(flight5);

        FlightData flight6 = new FlightData();
        flight6.setCarrier("AB");
        flight6.setFlightNo(346);
        flight6.setDeptCity("DEL");
        flight6.setDeptCtry("IN");
        flight6.setArrCity("JSM");
        flight6.setArrCtry("IN");
        flight6.setDepTim("2300");
        flight6.setArrtTim("0200");

        flightList.add(flight6);

        FlightData flight7 = new FlightData();
        flight7.setCarrier("AB");
        flight7.setFlightNo(456);
        flight7.setDeptCity("DEL");
        flight7.setDeptCtry("IN");
        flight7.setArrCity("CMB");
        flight7.setArrCtry("SL");
        flight7.setDepTim("1300");
        flight7.setArrtTim("1600");

        flightList.add(flight7);

        FlightData flight8 = new FlightData();
        flight8.setCarrier("AB");
        flight8.setFlightNo(567);
        flight8.setDeptCity("CMB");
        flight8.setDeptCtry("SL");
        flight8.setArrCity("JSM");
        flight8.setArrCtry("IN");
        flight8.setDepTim("1700");
        flight8.setArrtTim("2200");

        flightList.add(flight8);
        return flightList;
    }
}
