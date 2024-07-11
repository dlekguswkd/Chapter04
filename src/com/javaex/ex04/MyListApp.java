package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {

	public static void main(String[] args) {
		
		ArrayList<Point> pList=new ArrayList<Point>();
		//List<Point> pList=new LinkedList<Point>();

		Point p01=new Point(2,2);
		Point p02=new Point(12,13);
		Point p03=new Point(22,23);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList.size()); //갯수
		
		Point p=pList.get(1);
		System.out.println(p.getY()); //p02의 y값
		
		Point p2=pList.get(2);
		System.out.println(p2.toString());
		
		for(int i=0;i<pList.size(); i++) {
			Point pp=pList.get(i);
			System.out.println(pp.toString());
		}
		
		System.out.println("-------------------");
		pList.remove(1);	//->pList.add(p02);

		for(int i=0;i<pList.size(); i++) {
			Point pp=pList.get(i);
			System.out.println(pp.toString());
		}
		System.out.println("-------------------");
		System.out.println(pList.toString()); //Point에 있는 투스트링가져옴 거기에 없으면
								//부모쪽에서 가져옴
		
		System.out.println(pList);		//tostring 생략가능 알아서 해줌
	}

}
