package com.sameer.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test2 {

	public static void main(String args[]){

		/*StringBuilder builder = new StringBuilder("sameer");
		builder.insert(1,"_");
		System.out.println(builder.toString());*/

		//Queue<Integer> queue = new LinkedList<>();


//		Comparator comparator = new Comparator() {
//			@Override
//			public int compare(Object o1, Object o2) {
//				return 0;
//			}
//		};

//		Queue<Integer> queue2 = new PriorityQueue<>(5);
//		queue2.add(5);
//		queue2.add(4);
//		queue2.add(3);
//		queue2.add(1);
//		queue2.add(2);
//		queue2.add(0);
//
//		System.out.println(queue2);

		Point point1 = new Point(1,1,2);
		Point point2 = new Point(2,2,8);
		Point point3 = new Point(3,3,18);
		Point point4 = new Point(0.5,0.5,0.5);

		List<Point> pointList = new ArrayList<>();
		pointList.add(point2);
		pointList.add(point1);
		pointList.add(point3);

		//System.out.println(pointList);

    Comparator<Point> distanceComparator = new Comparator<Point>() {
			@Override
			public int compare(Point point1, Point point2) {
				return (int) (point1.distance-point2.distance);
			}
		};


		Collections.sort(pointList,distanceComparator);

		//System.out.println(pointList);
	//	Collections.reverse(pointList);

/*    Queue<Point> queue = new PriorityQueue<>(11,distanceComparator);

		queue.add(point3);
    queue.add(point2);
		queue.add(point1);
		queue.add(point4);

		System.out.println(queue.peek());*/

/*		Queue<Point> queue = new PriorityQueue<>();
		queue.add(point3);
		queue.add(point2);
		queue.add(point1);
		queue.add(point4);

		System.out.println(queue.peek());

		point1.distance = 0.2;

		System.out.println(queue.peek());*/



	}


}
