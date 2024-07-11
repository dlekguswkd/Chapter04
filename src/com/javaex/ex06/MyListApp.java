package com.javaex.ex06;

import java.util.ArrayList;

public class MyListApp {

	public static void main(String[] args) {
		
		ArrayList<Circle> cList=new ArrayList<Circle>();
		
		Circle c01= new Circle(5);
		Circle c02= new Circle(15);
		Circle c03= new Circle(100);
		
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		
		System.out.println(cList.toString());
		System.out.println(cList.size());
		
		System.out.println("-----반지름-----");
		
		for(int i=0; i<cList.size(); i++) {
			System.out.println("반지름:"+cList.get(i).getRadius());
		}
		
		System.out.println("-----remove-----");
		cList.remove(1);
		System.out.println(cList.toString());
		System.out.println(cList.size());
		
		

	}

}
