package com.javaex.ex08;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		Set<Point> pSet= new HashSet<Point>();
		
		Point p01=new Point(1,2);
		Point p02=new Point(3,6);
		Point p03=new Point(1,2);
		//Point p03=new Point(5,10);
		
		/*
		 boolean test= p01.equals(p03)
		 System.out.println(test);  //->true
		 */
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		for(Point point : pSet) {
			System.out.println(point);
			System.out.println("x좌표: "+ point.getX());
		}
		
		
	}

}
