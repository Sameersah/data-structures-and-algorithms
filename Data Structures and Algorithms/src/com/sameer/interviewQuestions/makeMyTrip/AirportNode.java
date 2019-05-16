package com.sameer.interviewQuestions.makeMyTrip;

public class AirportNode {
    String airportName;
    String currTime;
    boolean isVisited;
    boolean isReachableSameDay;


    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCurrTime() {
        return currTime;
    }

    public void setCurrTime(String currTime) {
        this.currTime = currTime;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public boolean isReachableSameDay() {
        return isReachableSameDay;
    }

    public void setReachableSameDay(boolean reachableSameDay) {
        isReachableSameDay = reachableSameDay;
    }
}
