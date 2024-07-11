package com.javaex.ex01;

public class PointList {
	
	//필드
	private Point[] pArray;
	private int crtpos;

	//생성자
	public PointList() {
		//메모리 올리고
		pArray=new Point[3];
		crtpos=0;
	}

	public PointList(Point[] pArray) {
		super();
		this.pArray = pArray;
	}

	
	//메소드 gs

	//메소드 일반
	//점 관리
	public void add(Point point) {
		//현재배열 몇개?
		//현재배열+1 새로 만들고
		//이전배열-->현재배열 이동
		//현재배열 마지막에 point 추가
		this.pArray[crtpos]=point;
		crtpos++;
	}
	
	public Point get(int index) {	//방의주소
		return pArray[index];
	}
	
	public int size() {
		return crtpos;
	}
	
	
	
}
