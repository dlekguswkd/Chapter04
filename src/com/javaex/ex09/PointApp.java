package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		Map<String, Point> pMap=new HashMap<String, Point>();
		
		Point p01 = new Point(2,4);
		Point p02 = new Point(2,4);
		Point p03 = new Point(43,78);
		
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("박명수", p03);
		
		System.out.println(pMap.size());
		System.out.println(pMap.toString());	//순서 뒤죽박죽으로 나옴
		
		System.out.println(pMap.get("박명수").toString());	//tostring 생략가능
		System.out.println(pMap.get("박명수").getX());

		System.out.println("-------------");
		
		Point p04 =new Point(100, 100);
		pMap.put("박명수", p04);
		System.out.println(pMap.get("박명수")); //똑같은 이름의 키가 나오면 덮어버림
		
		
		System.out.println("----------------------2");
		//키 다 나오게하기 (키 이름)
		Set<String> keys= pMap.keySet();
		
		for(String key : keys) {
			System.out.println(key);  //key의 이름
			System.out.println(pMap.get(key).toString());
			System.out.println(pMap.get(key).getX());
		}
		
		System.out.println("----------------------3");
		
		Map<String, String> guestbookMap = new HashMap<String, String>();
		guestbookMap.put("date", "2024-07-12");
		guestbookMap.put("userName", "정우성");
		guestbookMap.put("pw", "1234");
		guestbookMap.put("contents", "왔다갑니다.");
		
		System.out.println(guestbookMap.get("userName"));
		System.out.println(guestbookMap.get("contents"));
		
	}

}
