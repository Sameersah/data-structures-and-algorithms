package com.sameer.test;

public class Point implements Comparable<Point> {
  double x;
  double y;
  double distance;

  public Point(){}
  public Point(double x, double y, double distance){
    this.x = x;
    this.y = y;
    this.distance = distance;
  }

  @Override
  public String toString(){
    return "x="+x+" y="+y+" distance="+distance;
  }


  @Override
  public int compareTo(Point point) {
    return (int) (this.distance - point.distance);
  }
}
