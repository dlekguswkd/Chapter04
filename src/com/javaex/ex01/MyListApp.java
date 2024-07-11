package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {
		
		/* 기존에 하던 방식
		//배열로 관리
		//단점 미리 갯수를 결정해야한다(낭비, 수정)
		//장점 갯수가 고정(변동폭이 작을때) 유리하다이미 결정되서 빠름
		Point[] pArray=new Point[3];
		
		Point p01=new Point(2,2);
		Point p02=new Point(3,3);
		Point p03=new Point(4,4);
		
		pArray[0]=p01;
		pArray[1]=p02;
		pArray[2]=p03;
		
		for(int i=0; i<pArray.length; i++) {
			System.out.println(pArray[i].toString());
		}
		*/
		
		//점 관리
		PointList pList =new PointList();
		
		//복잡 갯수가 늘었다줄었다 함
		Point p01=new Point(2,2);
		Point p02=new Point(3,3);
		Point p03=new Point(4,4);
		
		pList.add(p01);		//주소 전달
		pList.add(p02);
		pList.add(p03);
		Point p=pList.get(1);
		System.out.println(p.toString());
		System.out.println(pList.size());
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("-----------------");
		
		//원 관리
		CircleList cList=new CircleList();
		
		Circle c01=new Circle(5);
		Circle c02=new Circle(10);
		Circle c03=new Circle(100);
		
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		
		Circle c=cList.get(0);
		System.out.println(c.toString());
		System.out.println(cList.size());
		
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
		}

		
	}

}
